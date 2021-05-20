package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class BusTicketsPage {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[1]/div/span/div/div/input")
    private WebElement departureCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[2]/div/span/div/div/input")
    private WebElement arrivalCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[3]/div/div/div/input")
    private WebElement departureDate;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[2]/div[1]/div/form/div/div/div[6]/button/span/span[3]")
    private WebElement findTicked;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[4]/div[1]/div/div/input")
    private WebElement changePerson;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div[3]/button/div")
    private WebElement incrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div[1]/button/div")
    private WebElement decrementPerson;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/button/div")
    private WebElement incrementChild;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[3]/div/div/div/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/button/div")
    private WebElement decrementChild;
}
