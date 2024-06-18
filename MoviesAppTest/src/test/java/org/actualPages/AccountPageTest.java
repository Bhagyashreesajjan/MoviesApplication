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
public class AccountPageTest extends BaseTest {

    @Test(priority = 1)
    public void testAccountPageUI(){
        homePage.clickOnAccountPage();
        // Test the Website logo is displayed or not
        Assert.assertTrue(homePage.websiteLogo().isDisplayed(),"Website logo is not displayed");
        // verify the text of navbar elements
        Assert.assertEquals(homePage.navbarElement1text(),"Home","Navbar element text doesn't match");
        Assert.assertEquals(homePage.navbarElement2text(),"Popular","Navbar element text doesn't match");
        // test the user profile image is displayed or not
        Assert.assertTrue(movieDetailsPage.profileImg().isDisplayed(),"profile image is not displayed");

        // test the Account page text matched or not
        Assert.assertEquals(accountPage.accountPageHeading(),"Account","Account heading text does not match");
        Assert.assertEquals(accountPage.memberShipText(),"Member ship","Member ship text does not match");
        Assert.assertEquals(accountPage.planDetailsText(),"Plan details","Plan details text does not match");
        Assert.assertEquals(accountPage.userNameText(),"User name : rahul","Username text does not match");
        Assert.assertEquals(accountPage.passwordText(),"Password : **********","Password text does not match");

        // Test the ContactUs Icons are displayed or not
        Assert.assertTrue(homePage.googleIconDisplayed().isDisplayed(),"Google icon is not displayed");
        Assert.assertTrue(homePage.twitterIconDisplayed().isDisplayed(),"Twitter icon is not displayed");
        Assert.assertTrue(homePage.instagramIconDisplayed().isDisplayed(),"Instagram icon is not displayed");
        Assert.assertTrue(homePage.youtubeIconDisplayed().isDisplayed(),"Youtube icon is not displayed");
        // Test the ContactUs Text is displayed or not
        Assert.assertEquals(homePage.contactUsText(),"Contact Us","contact us text doesn't match");

    }
    @Test(priority = 2)
    public void testLogoutFunctionality(){
        homePage.clickOnAccountPage();
        // test the logout button is displayed or not
        Assert.assertTrue(accountPage.logoutButtonDisplayed().isDisplayed(),"Logout button is not displayed");

        // test the Logout function
        accountPage.logoutButtonDisplayed().click();

    }


}