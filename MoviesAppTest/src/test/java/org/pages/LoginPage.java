package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    WebDriverWait wait;

    @FindBy(className = "login-website-logo")
    WebElement appLogoEle;

    @FindBy(className = "sign-in-heading")
    WebElement headingTextEle;

    @FindBy(css = "label[for='usernameInput']")
    WebElement userNameLabelTextEle;

    @FindBy(css = "label[for='passwordInput']")
    WebElement passwordLabelTextEle;

    @FindBy(className = "login-button")
    WebElement loginButtonEle;

    @FindBy(id = "usernameInput")
    WebElement userNameEle;

    @FindBy(id = "passwordInput")
    WebElement passwordEle;

    @FindBy(className = "error-message")
    WebElement errorMessageEle;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);

    }

    public WebElement appLogo(){
        return  appLogoEle;
    }

    public String headingText(){
        return headingTextEle.getText();
    }

    public String userNameLabelText(){
        return userNameLabelTextEle.getText();
    }

    public String passwordLabelText(){
        return passwordLabelTextEle.getText();
    }

    public WebElement loginButtonIsEnabled(){
        return  loginButtonEle;
    }

    public void enterUserName(String username){
        userNameEle.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordEle.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButtonEle.click();
    }

    public void loginToApplication(String username,String password){
        enterUserName(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String errorMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message"))).getText();
    }


}