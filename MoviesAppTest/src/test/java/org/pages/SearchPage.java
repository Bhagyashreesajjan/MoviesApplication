package org.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class SearchPage {
    public WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[@data-testid='searchButton']")
    WebElement searchButtonEle;

    @FindBy(css = "input.search-input-field")
    WebElement searchMovieEle;

    @FindBy(xpath = "//a[@class='link-item']")
    WebElement countMoviesDisplayedEle;


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    public void clickOnSearchButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='searchButton']")));
        searchButtonEle.click();
    }

    public void searchMovie(String movieName) {
        searchMovieEle.sendKeys(movieName);
        searchButtonEle.click();
    }

    public int countMoviesDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='link-item']")));
        List<WebElement> countMoviesDisplayed = driver.findElements(By.xpath("//a[@class='link-item']"));
        int moviesCount = 0;
        for (WebElement movies : countMoviesDisplayed){
            if (movies.isDisplayed()){
                moviesCount++;
            }
        }
        return moviesCount;
    }

}