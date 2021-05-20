package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[4]/div/div[1]/div[1]")
    private WebElement planeService;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[4]/div/div[1]/div[2]")
    private WebElement railwayService;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[4]/div/div[1]/div[3]")
    private WebElement busService;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[4]/div/div[1]/div[4]")
    private WebElement commuterTrainsService;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a")
    private WebElement changeLanguage;


    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/div/span")
    private WebElement logging;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/div/a")
    private WebElement registration;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void click(WebElement element) {
        element.click();
    }

//    public void inputSearchCondition(String condition) {
//        searchInput.sendKeys(condition);
//    }
}
