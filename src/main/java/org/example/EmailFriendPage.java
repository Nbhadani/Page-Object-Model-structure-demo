package org.example;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils {
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail =  By.xpath("//input[@class='your-email']");
    private By _textBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.name("send-email");

    private String friendEmail = "amit11@yahoo.co.uk";
    private String yourEmail = "radha11@yahoo.co.uk";
    private String message = "This is best product";
    String expected = "Your message has been sent.";
    private By _emailSuccessMessage = By.xpath("//div[@class='result']");


    public void verifyUserOnEmailAFriendPage(){
        assertURL("productemailafriend");
    }
    public  void emailAFriendDetails(){
        enterText(_friendEmail,friendEmail);
        enterText(_yourEmail,yourEmail);
        enterText(_textBox,message);
        clickOnElement(_sendEmail);
    }
    public  void verifyUserSeeSuccessMessageOfEmailAFriend(){
        assertTextMessage("Your message has not been sent",expected,_emailSuccessMessage);
    }

}
