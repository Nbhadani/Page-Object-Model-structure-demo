package org.example;

import org.openqa.selenium.By;

public class JewelryPage extends Utils{
    private By _product1 = By.xpath("//input[contains(@onclick, '/compareproducts/add/40')]");
    private By _product2 = By.xpath("//input[contains(@onclick,'/compareproducts/add/41')]");
    private By _comparisonLink = By.xpath("//a[text()='product comparison']");
    //verify that user os on jewelry category page
    public void verifyUserIsOnJewelryPage(){
        assertURL("jewelry");
    }
    // user choose product to compare
    public void chooseProductsToCompare(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        clickOnElement(_product1);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_product2);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_comparisonLink);
    }

}
