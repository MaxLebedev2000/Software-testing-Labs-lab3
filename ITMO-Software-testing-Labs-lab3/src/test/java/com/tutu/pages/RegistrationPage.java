package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class RegistrationPage {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/div[1]/form/input[2]")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/div[1]/form/div[3]/label/input")
    private WebElement checkboxApproval;

    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/div[1]/form/div[4]")
    private WebElement registrationButton;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void click(WebElement element) {
        element.click();
    }

    public void inputEmail(String email) {
            emailField.sendKeys(email, Keys.ENTER);

    }


}
