package org.example;

import org.openqa.selenium.By;

public class ProductDetailPage extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[contains(@onclick,'/productemailafriend/')]");
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _writeInTextBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.xpath("//input[@name = 'send-email']");
    String expected = "Your message has been sent";
    private By _actual = By.className("result");
    String _notRegisterExpected = "Enter your email";
    private By _notRegisterActual = By.id("Your Email address-error");


    //Verify user on computer catagories page
    public void verifyUserOnComputerCatagoriesPage() {
        assertURL("computers");
    }

    // user click on notebooks
    public void userClickOnNoteBook() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickOnElement(_noteBooks);
    }

    // user click on apple mac
    public void userClickOnAppleMac() {

        clickOnElement(_appleMac);
    }

    //Refer to friend
    public void UserReferToFriend() {
        //click email refer+

        clickOnElement(_email);

        //Enter friend email id
        enterText(_friendEmail, "amit11@yahoo.co.uk");
        //enter your email id
        enterText(_yourEmail, "radha11@yahoo.co.uk");
        //click send email button
        clickOnElement(_sendEmail);
    }

    public void verifyUserSeeEmailSentMessage() {
        assertTextMessage("Email not send", expected, _actual);
    }

    public void verifyUserNotRegisterUserSeeErrorMessage() {
        assertTextMessage("fail", _notRegisterExpected, _notRegisterActual);

    }
}


