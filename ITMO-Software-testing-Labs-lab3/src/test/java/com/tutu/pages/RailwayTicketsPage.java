package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class RailwayTicketsPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[2]/div[1]/div/form/div/div/div[1]/div/div[1]/div[1]/input")
    private WebElement departureCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[2]/div[1]/div/form/div/div/div[3]/div/div[1]/div[1]/input")
    private WebElement arrivalCity;


    @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div/div/div[4]/div/div[1]/div/input")
    private WebElement departureDate;


    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div/div/div[6]/button/span/span[3]")
    private WebElement findTicked;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[2]/div[1]/div/form/div/div/div[5]/div[1]/span")
    private WebElement  chooseArrivalDate;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[2]/div[1]/div/form/div/div/div[5]/div[2]/div/div[1]/input")
    private WebElement arrivalDate;



    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/div/button/div/div[1]/span")
    private WebElement chooseLastochka;


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[1]/div/button/div/div[1]/span")
    private WebElement chooseSapsan;


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[3]/div/button/div/div[1]/span")
    private WebElement chooseUnderPlaces;


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[4]/div/div/button/div[1]/div[1]/span")
    private WebElement selectCarrier;


    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[5]/div/div/button/div[1]/div[1]/span")
    private WebElement  chooseWagonType;


    @FindBy(xpath = "/html/body/div[3]/div[5]/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[6]/div/div[2]/a/span[1]")
    private WebElement choosePlaces;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[3]/button")
    private WebElement incrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/button/div/svg")
    private WebElement decrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[2]/div[2]/div[3]/button/div/svg")
    private WebElement incrementChild;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/button/div/svg")
    private WebElement decrementChild;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[3]/div[2]/div[3]/button/div/svg")
    private WebElement incrementBaby;


    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/div/div[3]/div[2]/div[1]/button/div/svg")
    private WebElement decrementBaby;


    @FindBy(xpath = "/html/body/div[3]/div[5]/div/div/div[1]/div[4]/div/div[2]/div[26]/div/div[6]/div/div[2]/a")
    private WebElement showPlaces;

    //*[@id="root"]/div/div[3]/div[3]/div/div/div[1]/div/div/div/div/div/div/div[1]/div[4]/div/div/div/button/div/div/span


    @FindBy(xpath = " /html/body/div[3]/div/div[3]/div[3]/div/div/div[1]/div/div/div/div/div/div/div[1]/div[4]/div/div/div/button")
    private WebElement show2Places;
    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[5]/div/div/div/div/div[2]/div[1]/div/button/div/div/span")
    private WebElement toPassengersButton;



    public RailwayTicketsPage(WebDriver driver) {
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
