package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class changeCurrencyResultPage extends Utils {

    // Verify Currency Change USD to EURO //

    public static void verifyCurrencyChangeUsDollarToEuro()

    {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we: productPrice)
        {
            softAssert.assertTrue(we.getText().contains("Ђ"),"Ђ is not found in" +we.getText());
        }
        softAssert.assertAll();
        System.out.println("Please check your currency");
    }

    // Verify Currency change from Euro to USD //

    public static void verifyCurrencyChangeEuroToUSDollar()
    {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
                for (WebElement we: productPrice)
    {
        softAssert.assertTrue(we.getText().contains("$"), " $ is not found in" +we.getText());
    }
                softAssert.assertAll();
        System.out.println("Please check your Currency");
    }
}





