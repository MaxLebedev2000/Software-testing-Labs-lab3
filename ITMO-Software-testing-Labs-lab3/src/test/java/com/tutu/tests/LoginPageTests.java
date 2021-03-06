package com.tutu.tests;

import com.tutu.pages.LoginPage;
import com.tutu.pages.MainPage;
import com.tutu.util.PropertyReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginPageTests {
    private PropertyReader propertyReader;
    private MainPage mainPage;
    private LoginPage loginPage;
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

        loginPage = new LoginPage(driver);

    }


//    @Test
//    @DisplayName("Check if search works correctly")


    @Test
    @DisplayName("Check if search works correctly")
    void mainPageSearchTest() throws InterruptedException {

        driver.get(propertyReader.getProperty("youtube_main_page"));

        WebElement foundElement =
                wait.until(presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/div/span")));
        foundElement.click();

//        Thread.sleep(10000);
//
//        loginPage.inputLogin("ogngnaogn");
//        Thread.sleep(10000);
//        loginPage.inputPassword("pkrgfnd");
//        Thread.sleep(10000);
//
//        loginPage.click(loginPage.getRestorePassword());




    }


}
