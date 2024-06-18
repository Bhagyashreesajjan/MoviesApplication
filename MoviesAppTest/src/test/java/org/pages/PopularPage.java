package org.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class PopularPage {
    public WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "div.search-movies-container")
    WebElement moviesDisplayedEle;

    public PopularPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public int moivesDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.search-movies-container li")));
        List<WebElement> moviesDispalyedCount = driver.findElements(By.cssSelector("div.search-movies-container li"));
        int moviesCount = 0;
        for (WebElement movies : moviesDispalyedCount){
            if (movies.isDisplayed()){
                moviesCount++;
            }
        }
        return moviesCount;
    }

}