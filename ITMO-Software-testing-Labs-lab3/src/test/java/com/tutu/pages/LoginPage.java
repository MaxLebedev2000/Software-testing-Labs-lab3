package com.tutu.pages;

import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/form/div[1]/span/input")
    private WebElement loginField;


    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/form/div[2]/input")
    private WebElement passwordField;


    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div[1]/form/div[3]/label/input")
    private WebElement rememberMe;


    @FindBy(xpath = "/html/body/div[8]/div/div/div/div/div/div/div[1]/form/div[4]/button")
    private WebElement enterButton;


    @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div/div/div[1]/form/div[3]/div/span")
    private WebElement restorePassword;


    @FindBy(xpath = "/html/body/div[8]/div/div/div/div/div/div/div[2]/form/div[1]/input")
    private WebElement emailRestorePassword;


    @FindBy(xpath = "/html/body/div[8]/div/div/div/div/div/div/div[2]/form/div[2]/button")
    private WebElement restoreButton;


    private String logging = "/html/body/div[3]/div[1]/div[1]/div[1]/div[2]/div[6]/div/div/div/div[1]/div/div/span";






    public void inputEmail(String email) {
        emailRestorePassword.sendKeys(email, Keys.ENTER);

    }




    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void click(WebElement element) {
        element.click();
    }

    public void inputLogin(String login) {
            loginField.sendKeys(login, Keys.ENTER);

    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password, Keys.ENTER);
    }
}
