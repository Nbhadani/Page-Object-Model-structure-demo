package org.example;

import org.openqa.selenium.By;


public class ProductComparison extends Utils {
    // comparison expected and actual
    String expected = "compare products";
    private By _PageTitle = By.xpath("//div [@class='page-title']");
    public void VerifyUserIsOnComparisionPage(){
        assertTextMessage("page not found",expected,_PageTitle);
    }
}




