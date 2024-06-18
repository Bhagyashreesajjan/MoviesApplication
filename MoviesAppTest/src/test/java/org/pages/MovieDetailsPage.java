package org.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MovieDetailsPage {
    public WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "img[src *='https://assets.ccbp.in/frontend/react-js/movies-app/grindhouse']")
    WebElement clickOnHomePageMovieEle;

    @FindBy(css = "h1.movie-title")
    WebElement movieTextEle;

    @FindBy(css = "p.watch-time")
    WebElement movieDurationEle;

    @FindBy(css = "button.play-button")
    WebElement playButtonEle;

    @FindBy(css = "img.avatar-img")
    WebElement profileImgEle;

    @FindBy(linkText = "Popular")
    WebElement clickOnPopularPageEle;

    @FindBy(css = "img[src *='https://assets.ccbp.in/frontend/react-js/movies-app/luca']")
    WebElement clickOnOneMoviePopluarpageEle;


    public MovieDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public void clickOnHomePageMovie(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src *='https://assets.ccbp.in/frontend/react-js/movies-app/grindhouse']"))).click();
    }

    public String movieTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.movie-title"))).getText();
    }

    public String movieDescription(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.movie-overview"))).getText();
    }

    public WebElement movieBackgroundImgDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[style *='background-image']")));
    }

    public String movieDuration(){
        return movieDurationEle.getText();
    }

    public WebElement playButtonDisplayed(){
        return playButtonEle;
    }

    public WebElement profileImg(){
        return profileImgEle;
    }

    public void clickOnPopularPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popular"))).click();
    }

    public void clickOnPopluarpageMovie(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.search-movies-container a")));
        clickOnOneMoviePopluarpageEle.click();
    }

}