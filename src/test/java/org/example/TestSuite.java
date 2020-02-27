package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparison productComparison = new ProductComparison();
    Catagories catagories = new Catagories();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Computers computers = new Computers();


    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        //click on register btn
        homePage.clickOnRegisterButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //fill registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully(){
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
        jewelryPage.chooseProductsToCompare();
        productComparison.VerifyUserIsOnComparisionPage();

    }
    @Test
    public void registerUserShouldAbleToReferAFriendSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        homePage.clickOnComputerCategory();
        catagories.verifyUserOnComputerCategoriesPage();
        catagories.userClickOnNoteBook();
        catagories.userClickOnAppleMac();
        catagories.UserReferToFriend();
    }
    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToaFriend(){
        homePage.clickOnComputerCategory();
        productDetailPage.verifyUserOnComputerCatagoriesPage();
        productDetailPage.userClickOnNoteBook();
        productDetailPage.userClickOnAppleMac();
        productDetailPage.UserReferToFriend();

    }
    @Test
    public void userShouldBeAbleToSortProductHighToLowByPrice(){
        homePage.clickOnComputerCategory();
        computers.userClickOnNoteBook();
        computers.userSelectFromPositionPriceHighToLow();
    }
    @Test

    public void verifyAddToCompareButtonForEachPrices() {
        List<WebElement> priceList = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we : priceList) {
            System.out.println(we.getText());
            Assert.assertTrue(we.getText().contains("$"));
            System.out.println("**************************");
        }

    }

    @Test

    public void userShouldBeAbleToChangeCurrency()
    {
        ChangeCurrency.selectCurrencyUsDollarToEuro();
        changeCurrencyResultPage.verifyCurrencyChangeUsDollarToEuro();

        ChangeCurrency.selectCurrencyEuroToUsDollar();
        changeCurrencyResultPage.verifyCurrencyChangeEuroToUSDollar();

    }

}