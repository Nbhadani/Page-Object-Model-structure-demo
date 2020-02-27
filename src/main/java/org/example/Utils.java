package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage{


//   timestamp method for register email so we dnt have to keep changing the email in register page.

    public static String createTimeStamp(){
        return new SimpleDateFormat( "yyyy.MM.dd.HH.mm.ss").format(new Date());
    }
    // reusable for click method

    public static void clickOnElement(By by){ driver.findElement(by).click();
    }

    // wait for clickable method
    public static void waitForClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    // wait for visible method
    public void waitForVisibility(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    //  wait for element present method
    public void waitForElementsPresent(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    //    REUSABLE METHOD FOR SEND KEYS.

    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    //    TO ADD @BEFORE METHOD FOR OPEN BROWSER
    @Before
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    //    TO ADD @AFTER METHOD FOR CLOSE BROWSER

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


    //get current URL
    public static void assertURL(String text){
    Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public static void assertTextMessage(String message, String expected, By by){
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected,actual);
}

    public static void SoftAssert(By by, String message) {
        SoftAssert softAssert = new SoftAssert();
        String className;

//        public void test_UsingSoftAssertion() {
//            softAssert.assertTrue(true == true);
//            softAssert.assertEquals();
//            softAssert.assertEquals(className, "SoftAssertion");
//            System.out.println("Last statement gets executed!");
//            softAssert.assertAll();
        }

    //select from dropdown by value method
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }



    //select from dropdown by visible text method
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }



    //select from dropdown by index method
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

}
