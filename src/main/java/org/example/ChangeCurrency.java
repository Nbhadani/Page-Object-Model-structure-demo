package org.example;

import org.openqa.selenium.By;

public class ChangeCurrency extends Utils
{
    private static By _changeCurrency = By.xpath("//select[@id=\"customerCurrency\"]");

    //select & change the currency from US dollar to Euro

    public static void selectCurrencyUsDollarToEuro()
    {selectFromDropdownByVisibleText(_changeCurrency,"Euro");}

    //select & change the currency from Euro to US dollar
    public static void selectCurrencyEuroToUsDollar()
    {selectFromDropdownByVisibleText(_changeCurrency,"US Dollar");}

}
