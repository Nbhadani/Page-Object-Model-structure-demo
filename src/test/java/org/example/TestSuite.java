package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully(){
        //click on register btn
        homePage.clickOnRegisterButton();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //fill registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        Comparison.comparingProducts();

    }
}
