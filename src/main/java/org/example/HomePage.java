package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
private By _registerLInk = By.linkText("Register");
private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
private By _computer = By.linkText("Computers");
// verify that user click on register button
public void clickOnRegisterButton() {
        clickOnElement(_registerLInk);
        }
//verify that user click on jewellery category
public void clickOnJewellery() {
        clickOnElement(_jewelryLink);
        }
//verify that user click on computer category
public void clickOnComputerCategory(){
        clickOnElement(_computer);
        }
}
