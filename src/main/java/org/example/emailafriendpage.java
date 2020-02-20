package org.example;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.linkText;


public class emailafriendpage extends Utils{

        private static By _electronics = By.linkText("Electronics");
        private static By _cellphones = By.linkText("Cell phones");
        private static By _HTCphones = By.linkText("HTC One Mini Blue");
        private static By _clickOnButton = By.className("Email a friend");
        private static By _email = By.id("FriendEmail");
        private static By _sendEmail = By.name("send-email");
        private static String TimeStamp = createTimeStamp();

    public static void emailingFriend(){

        clickOnElement(_electronics);
        clickOnElement(_cellphones);
        clickOnElement(_HTCphones);
        clickOnElement(_clickOnButton);
        enterText(_email,"khushiindia25+"+createTimeStamp()+"@yahoo.com");
        clickOnElement(_sendEmail);
    }
}
