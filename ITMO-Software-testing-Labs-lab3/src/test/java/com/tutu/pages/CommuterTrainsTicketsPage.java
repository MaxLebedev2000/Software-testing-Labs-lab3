package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Data
public class CommuterTrainsTicketsPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[4]/div[1]/form/div/div/div[1]/div/div[1]/div[1]/input")
    private WebElement departureCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[4]/div[1]/form/div/div/div[3]/div/div[1]/div[1]/input")
    private WebElement arrivalCity;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[4]/div[1]/form/div/div/div[4]/div/div/div/input")
    private WebElement departureDate;


    @FindBy(xpath = "/html/body/div[3]/div[1]/div[5]/div/div[4]/div[1]/form/div/div/div[5]/button/span/span[3]")
    private WebElement showSchedule;


}
