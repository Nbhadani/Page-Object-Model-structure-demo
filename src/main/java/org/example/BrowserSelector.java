package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils{

    public static void setUpBrowser(String browser) {
        String Browser = "ie";

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/Resourses/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "src/test/Resourses/BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "src/test/Resourses/BrowserDriver/IEDriverServer.exe");

            DesiredCapabilities inCapabilities = DesiredCapabilities.internetExplorer();
            inCapabilities.setCapability("nativeEvents", "false");
            inCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            inCapabilities.setCapability("ignoreProtectedModeSettings", "true");
            inCapabilities.setCapability("disable-pop up-blocking", "true");
            inCapabilities.setCapability("enablePersistentHover", "true");
            driver = new InternetExplorerDriver();
            // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else {
            System.out.println("browser does not match " + Browser);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public void closeBrowser(){
        driver.close();
    }
}


