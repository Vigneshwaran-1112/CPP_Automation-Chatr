package com.rogers.data.handlers;

import com.rogers.test.base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RedirectConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.config.RestAssuredConfig.config;
import static org.apache.logging.log4j.core.config.plugins.convert.Base64Converter.parseBase64Binary;

public class RTRMSubscriberStatusService extends BaseTest {


    public static RequestSpecification specIntegrated = new RequestSpecBuilder()
            .setConfig(config().redirect(RedirectConfig.redirectConfig().followRedirects(false)))
            .build();


public static Response getSubsriberStatus(String CTN) throws Exception {

    SSLConfig config = null;
    KeyStore keystore = createKeyStore(new File("src/test/resources/RTRMcerts/RTRM-pr.key"), new File("src/test/resources/RTRMcerts/RTRM.pem"), "roger1@#");
    System.out.println(keystore);
    org.apache.http.conn.ssl.SSLSocketFactory clientAuthFactory = new org.apache.http.conn.ssl.SSLSocketFactory(keystore, "roger1@#");

    // set the config in rest assured
    config = new SSLConfig().with().sslSocketFactory(clientAuthFactory).and().allowAllHostnames();
    System.out.print(config);
    RestAssured.config = RestAssured.config().sslConfig(config);

    Response r = (Response) RestAssured.given(specIntegrated)
            .header("Authorization", "PBM_OPERATION f6859cba-9940-14fe-82b0-cdaeab21594d")
            .queryParam("secondaryKeyMSISDN", "1"+CTN)
            .queryParam("getSubscriptions",true)
            .queryParam("getBalances",true)
            .contentType(ContentType.JSON)
            .get("https://camp-gw.egslb.vf.rogers.com/api/v1/qa1/services/rtrm-api/provisioningapi/subscribers")
            .then().statusCode(200)
            .extract().body();
    return r;
}

public static KeyStore createKeyStore(File privateKeyPem, File certificatePem, final String password)
        throws Exception, KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
    final X509Certificate[] cert = createCertificates(certificatePem);
    final KeyStore keystore = KeyStore.getInstance("JKS");
    keystore.load(null);
    // Import private key
    final PrivateKey key = createPrivateKey(privateKeyPem);
    keystore.setKeyEntry(privateKeyPem.getName(), key, password.toCharArray(), cert);
    return keystore;
}
    private static X509Certificate[] createCertificates(File certificatePem) throws Exception {
        final List<X509Certificate> result = new ArrayList<X509Certificate>();
        final BufferedReader r = new BufferedReader(new FileReader(certificatePem));
        String s = r.readLine();
        if (s == null || !s.contains("BEGIN CERTIFICATE")) {
            r.close();
            throw new IllegalArgumentException("No CERTIFICATE found");
        }
        StringBuilder b = new StringBuilder();
        while (s != null) {
            if (s.contains("END CERTIFICATE")) {
                String hexString = b.toString();
                final byte[] bytes = parseBase64Binary(hexString);
                X509Certificate cert = generateCertificateFromDER(bytes);
                result.add(cert);
                b = new StringBuilder();
            } else {
                if (!s.startsWith("----")) {
                    b.append(s);
                }
            }
            s = r.readLine();
        }
        r.close();

        return result.toArray(new X509Certificate[result.size()]);
    }



    private static PrivateKey createPrivateKey(File privateKeyPem) throws Exception {
        final BufferedReader r = new BufferedReader(new FileReader(privateKeyPem));
        String s = r.readLine();
        if (s == null || !s.contains("BEGIN PRIVATE KEY")) {
            r.close();
            throw new IllegalArgumentException("No PRIVATE KEY found");
        }
        final StringBuilder b = new StringBuilder();
        s = "";
        while (s != null) {
            if (s.contains("END PRIVATE KEY")) {
                break;
            }
            b.append(s);
            s = r.readLine();
        }
        r.close();
        final String hexString = b.toString();
        final byte[] bytes = parseBase64Binary(hexString);
        return generatePrivateKeyFromDER(bytes);
    }
    private static RSAPrivateKey generatePrivateKeyFromDER(byte[] keyBytes) throws InvalidKeySpecException, NoSuchAlgorithmException {
        final PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        final KeyFactory factory = KeyFactory.getInstance("RSA");
        return (RSAPrivateKey) factory.generatePrivate(spec);
    }

    private static X509Certificate generateCertificateFromDER(byte[] certBytes) throws CertificateException {
        final CertificateFactory factory = CertificateFactory.getInstance("X.509");
        return (X509Certificate) factory.generateCertificate(new ByteArrayInputStream(certBytes));
    }
    }