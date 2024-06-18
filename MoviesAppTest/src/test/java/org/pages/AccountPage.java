package org.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class AccountPage {
	    public  WebDriver driver;
	    public WebDriverWait wait;

	    @FindBy(css = "h1.account-heading")
	    WebElement accountPageHeadingEle;

	    @FindBy(xpath = "//p[text()='Member ship']")
	    WebElement memberShipTextEle;

	    @FindBy(xpath = "//p[text()='Plan details']")
	    WebElement planDetailsTextEle;

	    @FindBy(css = "p.membership-username")
	    WebElement userNameTextEle;

	    @FindBy(css = "p.membership-password")
	    WebElement passwordTextEle;

	    @FindBy(css = "button.logout-button")
	    WebElement logoutButtonDisplayedEle;

	    public AccountPage(WebDriver driver){
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        PageFactory.initElements(driver,this);
	    }

	    public String accountPageHeading(){
	        return accountPageHeadingEle.getText();
	    }

	    public String memberShipText(){
	        return memberShipTextEle.getText();
	    }

	    public String planDetailsText(){
	        return planDetailsTextEle.getText();
	    }

	    public String userNameText(){
	        return userNameTextEle.getText();
	    }

	    public String passwordText(){
	        return passwordTextEle.getText();
	    }

	    public WebElement logoutButtonDisplayed(){
	        return logoutButtonDisplayedEle;
	    }

	}

