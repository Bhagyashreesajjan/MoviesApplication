package org.actualPages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


import java.time.Duration;

@Listeners(MoviesAppTestReports.class)
public class SearchPageTest extends BaseTest{

    @Test(priority = 1)
    public void searchFunctionalityTest1(){
        searchPage.clickOnSearchButton();
        searchPage.searchMovie("No Time to Die");
        Assert.assertEquals(searchPage.countMoviesDisplayed(),1,"Movies displayed count does not match");
    }

    @Test(priority = 2)
    public void searchFunctionalityTest2(){
        searchPage.clickOnSearchButton();
        searchPage.searchMovie("Avatar");
        Assert.assertEquals(searchPage.countMoviesDisplayed(),1,"Movies displayed count does not match");
    }

}