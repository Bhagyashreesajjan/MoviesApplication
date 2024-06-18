package org.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    WebDriverWait wait;
    public List<WebElement> navBarEleList;


    @FindBy(xpath = "//a[text()='Home']")
    WebElement homePageTextEle;

    @FindBy(xpath = "//h1[text()='Trending Now']")
    WebElement buttomSectionHeadingEle1;

    @FindBy(xpath = "//h1[text()='Originals']")
    WebElement buttomSectionHeadingEle2;

    @FindBy(className = "home-movie-play-button")
    WebElement playButtonDisplayedEle;

    @FindBy(css = "svg[class *='icon-element google-']")
    WebElement googleIconDisplayedEle;

    @FindBy(css = "svg[class *='icon-element twitter-ic']")
    WebElement twitterIconDisplayedEle;

    @FindBy(css = "svg[class *='icon-element instagram-']")
    WebElement instagramIconDisplayedEle;

    @FindBy(css = "svg[class *='icon-element youtube-']")
    WebElement youtubeIconDisplayedEle;

    @FindBy(className = "contact-us-paragraph")
    WebElement contactUsTextEle;

    @FindBy(className = "website-logo")
    WebElement webSiteLogoEle;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement navbarTextEle1;

    @FindBy(xpath = "//a[text()='Popular']")
    WebElement navbarTextEle2;

    @FindBy(linkText = "Popular")
    WebElement popularEleLink;

    @FindBy(linkText = "Home")
    WebElement homeEleLink;

    @FindBy(css = "img[src *='https://assets.ccbp.in/frontend/react-js/ins']")
    WebElement accountPageClickEle;


    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public String homePageText(){
        return homePageTextEle.getText();
    }

    public String buttomSectionHeading1(){
        return buttomSectionHeadingEle1.getText();
    }

    public String buttomSectionHeading2(){
        return buttomSectionHeadingEle2.getText();
    }

    public WebElement playButtonDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("home-movie-play-button")));
    }

    public WebElement googleIconDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[class *='icon-element google-']")));

    }

    public WebElement twitterIconDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[class *='icon-element twitter-ic']")));
    }

    public WebElement instagramIconDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[class *='icon-element instagram-']")));
    }

    public WebElement youtubeIconDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[class *='icon-element youtube-']")));
    }

    public String contactUsText(){
        return contactUsTextEle.getText();
    }

    public WebElement websiteLogo(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("website-logo")));
    }

    public int navbarEleCount(){
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.nav-menu-list a")));
        navBarEleList = driver.findElements(By.cssSelector("ul.nav-menu-list a"));
        return navBarEleList.size();
    }

    public String navbarElement1text(){
        return navbarTextEle1.getText();
    }
    public String navbarElement2text(){
        return navbarTextEle2.getText();
    }

    public void clickOnPopular(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popular"))).click();
    }

    public void clickOnHome(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home"))).click();
    }

    public void clickOnAccountPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("slick-slide")));
        accountPageClickEle.click();
    }


}
