package org.example;

import org.openqa.selenium.By;

public class Comparison extends Utils{

    public static void comparingProducts(){

        clickOnElement(By.name("register-continue"));
        clickOnElement(By.linkText("Electronics"));
        clickOnElement(By.linkText("Cell phones"));
        clickOnElement(By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/19\"),!1']"));

        clickOnElement(By.xpath("//span[@title='Close']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(By.xpath("//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/20\"),!1']"));
        clickOnElement(By.linkText("product comparison"));


        String expected1 = "Nokia Lumia 1020";
        assertTextMessage("Nokia Lumia 1020",expected1, By.linkText("Nokia Lumia 1020"));

        String expected2 = "HTC One Mini Blue";
        assertTextMessage("HTC One Mini Blue",expected2, By.linkText("HTC One Mini Blue"));

    }
}



