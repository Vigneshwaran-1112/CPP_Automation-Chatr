package com.rogers.test.tests.desktop.Unused;
import com.rogers.data.handlers.TestDataHandler;
import com.rogers.pages.DataProvidPage;
import com.rogers.pages.ENSQuery;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import static com.rogers.test.base.BaseTest.*;

public class DataCreation_Test  extends BaseTest {

    @Test(dataProvider = "PlanValue_3G",dataProviderClass = DataProvidPage.class)
    public void CPP_Validate_NAC_Flow_Using_CreditCard_With_All_Plan_3G_with_Email_Validation(String planName, String planValue) throws FileNotFoundException, InterruptedException, SQLException {
        //Get Nac Flow Data
        String emailId = getSignInPage().generateRandomEmail();
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        //String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = emailId;//TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        System.out.println(" NAC Flow Run With - "+planName);
        getPlanPage().selectPlan(planValue);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(planValue, phoneNumber, firstName + " " + lastName, dateOfBirth, email, topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(emailId,"CPP_ORDER_ACTIVATION");
        getSignInPage().validateActivationOrderIdForNacFlow(email,result,orderNumber,planValue+".00",phoneNumber);
        getEASPage().setCreatedCTN(phoneNumber,planValue);
    }
    @Test(dataProvider = "PlanValue_4G",dataProviderClass = DataProvidPage.class, groups = {"NACCCALL"})
    public void CPP_24079_Validate_NAC_Flow_Using_CreditCard_With_All_Plan_4G(String planName, String planValue) throws FileNotFoundException, InterruptedException, SQLException {
        //Get Nac Flow Data
        String emailId = getSignInPage().generateRandomEmail();
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        //String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = emailId;//TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        System.out.println(" NAC Flow Run With - "+planName);
        getPlanPage().selectPlan(planValue);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(planValue, phoneNumber, firstName + " " + lastName, dateOfBirth, email, topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(emailId,"CPP_ORDER_ACTIVATION");
        getSignInPage().validateActivationOrderIdForNacFlow(email,result,orderNumber,planValue+".00",phoneNumber);
        getEASPage().setCreatedCTN(phoneNumber,planValue);
    }
}

