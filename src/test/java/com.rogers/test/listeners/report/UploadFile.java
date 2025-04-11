package com.rogers.test.listeners.report;

import com.akamai.netstorage.DefaultCredential;
import com.akamai.netstorage.NetStorage;
import com.akamai.netstorage.NetStorageException;
import org.apache.commons.net.ftp.FTPClient;

import javax.mail.MessagingException;
import java.io.*;

public class UploadFile {
        private static String remoteDirectoryPath= Manager.relativePathToReport;
        private static String srcFolderPath = Manager.absolutePathToReport;
        /**
         * Capture the reports from the test executed  machine and copy it to the FTP server with the corresponding projects folder.
         * @throws MessagingException Email Message Exception
         * @return String, remoteDirectoryPath+strFileName, path + file name
         */
        public static String extentReportsUpload() throws MessagingException  {

            FTPClient client = new FTPClient();
            FileInputStream fis = null;
            String strFileName="";

            try {
                client.connect(System.getenv("FTP_SERVER"));
                client.login(System.getenv("FTP_USERNAME"), System.getenv("FTP_PASSWORD"));
                // Change the format and folder as per your project needs
                client.setFileType(FTPClient.BINARY_FILE_TYPE);

                File folder = new File(srcFolderPath);
                if (folder.isDirectory()) {
                    client.makeDirectory(remoteDirectoryPath);
                    client.changeWorkingDirectory(remoteDirectoryPath);
                    for (File file : folder.listFiles()) {
                        fis = new FileInputStream(srcFolderPath+"/"+ file.getName());
                        if(file.getName().contains(".html"))
                        {
                            strFileName = file.getName();
                        }
                        client.storeFile(file.getName(), fis);
                    }
                    client.changeToParentDirectory();
                }
                else {
                    InputStream fisf = folder.toURI().toURL().openStream();
                    client.storeFile(folder.getName(), fisf);
                }
                client.logout();

                //SendEmail.sendEmail(remoteDirectoryPath+strFileName);

            } catch (IOException e) {
                e.printStackTrace();
                e.getCause();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    client.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return (remoteDirectoryPath+strFileName);
        }

        /**
         * Upload test reports to NetStorage
         * @return String, the string of NetStorage report URL
         * @author Ning.Xue
         */
        public static String UploadToNetStorage(){
            String strReportPath = "FailedUploading";
            String nsHost = System.getenv("NETSTORAGE_HOST");
            DefaultCredential credential = new DefaultCredential(nsHost,System.getenv("NETSTORAGE_ID"), System.getenv("NETSTORAGE_ACCESS_KEY"));
            NetStorage ns = new NetStorage(credential);
            try{
                File folder = new File(srcFolderPath);
                if (folder.isDirectory() && folder.listFiles().length > 0) {
                    for (File file : folder.listFiles()) {
                        InputStream inputStream = new FileInputStream(srcFolderPath+"/"+ file.getName());
                        if(file.getName().contains(".html")){
                            strReportPath = remoteDirectoryPath + file.getName();
                            System.out.println("Test report uploaded to NetStorage at path: " + strReportPath);
                        }
                        ns.upload("1073444/Digital-QE/report/" + remoteDirectoryPath + file.getName(), file, null, false);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (NetStorageException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return strReportPath;
        }


    }
