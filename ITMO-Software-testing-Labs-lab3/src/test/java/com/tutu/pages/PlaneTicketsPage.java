package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class PlaneTicketsPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[2]/div[1]/div[1]/input")
    private WebElement departureCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[2]/div[3]/div[1]/input")
    private WebElement arrivalCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[2]/div[4]/div[1]/input")
    private WebElement departureDate;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[2]/div[6]/div[1]/input")
    private WebElement arrivalDate;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[2]/div[7]/button/span/span[3]")
    private WebElement findTicked;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div[2]")
    private WebElement incrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div[1]")
    private WebElement decrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[2]/div/div[2]")
    private WebElement incrementChild;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[2]/div/div[1]")
    private WebElement decrementChild;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[1]/div/div[2]")
    private WebElement incrementBaby;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[1]/div[3]/div/div[2]")
    private WebElement decrementBaby;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[1]/div/div[7]/div/div[2]/div/div[1]/span")
    private WebElement selectClass;



    public PlaneTicketsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void click(WebElement element) {
        element.click();
    }

    public void inputText(String text, WebElement webElement) {
        webElement.sendKeys(text, Keys.ENTER);

    }
}
