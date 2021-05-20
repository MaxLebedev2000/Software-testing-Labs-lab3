package com.tutu.tests;

import com.tutu.pages.MainPage;
import com.tutu.pages.RailwayTicketsPage;
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
public class RailwayTicketsPageTests {
    private PropertyReader propertyReader;
    private RailwayTicketsPage railwayTicketsPage;
    private WebDriver driver;
    private WebDriverWait wait;
    private MainPage mainPage;

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

        railwayTicketsPage = new RailwayTicketsPage(driver);
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

        railwayTicketsPage.inputText("Москва", railwayTicketsPage.getArrivalCity());
        Thread.sleep(1000);
        railwayTicketsPage.inputText("Санкт-Петербург", railwayTicketsPage.getDepartureCity());
        Thread.sleep(1000);
        railwayTicketsPage.inputText("22.05.2021, сб", railwayTicketsPage.getDepartureDate());
        Thread.sleep(5000);
        railwayTicketsPage.click(railwayTicketsPage.getChoosePlaces());

//        WebElement foundElement =
//                wait.until(presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[3]/button")));
//        foundElement.click();





//        Thread.sleep(5000);
//        railwayTicketsPage.click(railwayTicketsPage.getIncrementPerson());
//        Thread.sleep(10000);
//        railwayTicketsPage.click(railwayTicketsPage.getShowPlaces());


//        WebElement foundElement =
//                wait.until(presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[3]/button/div/svg/use//svg/path")));
//        foundElement.click();
//        railwayTicketsPage.click(railwayTicketsPage.getIncrementPerson());
//        Thread.sleep(1000);
//        railwayTicketsPage.click(railwayTicketsPage.getIncrementBaby());
//        Thread.sleep(1000);
//        railwayTicketsPage.click(railwayTicketsPage.getIncrementChild());
//        railwayTicketsPage.click(railwayTicketsPage.getFindTicked());


    }


//    @AfterAll
//    void destroy() {
//        driver.quit();
//    }
}
