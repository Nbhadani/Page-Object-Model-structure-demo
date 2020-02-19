package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    public void clickOnRegisterButton(){
        clickOnElement(_registerLink);

    }

}
