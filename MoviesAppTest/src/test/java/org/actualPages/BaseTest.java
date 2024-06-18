package org.actualPages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.AccountPage;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.pages.MovieDetailsPage;
import org.pages.PopularPage;
import org.pages.SearchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    AccountPage accountPage;
    MovieDetailsPage movieDetailsPage;
    PopularPage popularPage;
    SearchPage searchPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");

        driver = new EdgeDriver();
        // driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        movieDetailsPage = new MovieDetailsPage(driver);
        accountPage = new AccountPage(driver);
        popularPage = new PopularPage(driver);
        searchPage = new SearchPage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");

        loginPage.loginToApplication("rahul", "rahul@2021");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}