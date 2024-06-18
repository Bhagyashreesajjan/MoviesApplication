package org.actualPages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import java.time.Duration;

@Listeners(MoviesAppTestReports.class)
public class HeaderSectionTest extends BaseTest {

    // Test the Header Section UI
    @Test(priority = 1)
    public void testHeaderSectionUI(){
        // Test the Website logo is displayed or not
        Assert.assertTrue(homePage.websiteLogo().isDisplayed(),"Website logo is not displayed");

        // verify count of navbar elements
        Assert.assertEquals(homePage.navbarEleCount(),2,"Navbar elements count doesn't match");

        // verify the text of navbar elements
        Assert.assertEquals(homePage.navbarElement1text(),"Home","Navbar element text doesn't match");
        Assert.assertEquals(homePage.navbarElement2text(),"Popular","Navbar element text doesn't match");
    }

    // Test Header Section Functionalities
    @Test(priority = 2)
    public void testHeaderSectionFunctionalities(){
        // Test the navigation to Popular page
        homePage.clickOnPopular();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://qamoviesapp.ccbp.tech/popular","URLs does not match");

        // Test the navigation to Home page
        homePage.clickOnHome();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://qamoviesapp.ccbp.tech/","URLs does not match");

        // Test the navigation to Account page
        homePage.clickOnAccountPage();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://qamoviesapp.ccbp.tech/account","URLs does not match");

    }

}