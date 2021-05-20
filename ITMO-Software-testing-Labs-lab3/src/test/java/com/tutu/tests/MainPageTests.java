package com.tutu.tests;

import com.tutu.pages.MainPage;
import com.tutu.util.PropertyReader;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainPageTests {
    private PropertyReader propertyReader;
    private MainPage mainPage;
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    void init() {
        propertyReader = new PropertyReader();
        propertyReader.setProp("driver-prop.properties");

        if (propertyReader.getProperty("current_driver").equals("chrome_driver")) {
            System.setProperty("webdriver.chrome.driver", propertyReader.getProperty("chrome_driver"));

            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", propertyReader.getProperty("mozilla_driver"));
            driver = new FirefoxDriver();
        }

        propertyReader.setProp("config.properties");

        wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();

        mainPage = new MainPage(driver);

    }


//    @Test
//    @DisplayName("Check if search works correctly")


    @Test
    @DisplayName("Check if search works correctly")
    void mainPageSearchTest() throws InterruptedException {

        driver.get(propertyReader.getProperty("youtube_main_page"));
        Thread.sleep(1000);
        mainPage.click(mainPage.getRailwayService());

        Thread.sleep(1000);


        mainPage.click(mainPage.getBusService());
        Thread.sleep(1000);

        mainPage.click(mainPage.getCommuterTrainsService());
        Thread.sleep(1000);
        mainPage.click(mainPage.getChangeLanguage());


    }


//    @AfterAll
//    void destroy() {
//        driver.quit();
//    }
}
