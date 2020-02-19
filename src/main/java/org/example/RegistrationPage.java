package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.Utils.createTimeStamp;

public class RegistrationPage extends Utils {




    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "John";
    private String lastName = "Smith";
    private static String TimeStamp = createTimeStamp();

    public void verifyUserIsOnRegisterPage(){
    assertURL("register");

    }


    public void userEntersRegistrationDetails(){


        enterText(_firstName,firstName);
        enterText(_lastName,lastName);
        enterText(_email,"khushiindia25+"+createTimeStamp()+"@yahoo.com");
        enterText(_password,"John125");
        enterText(_confirmPassword,"John125");
        clickOnElement(_registerButton);


    }
}
