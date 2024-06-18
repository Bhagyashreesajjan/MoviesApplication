package org.actualPages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import java.time.Duration;

@Listeners(MoviesAppTestReports.class)
public class HomePageTest extends  BaseTest{

    //Test the heading texts of each section
    @Test(priority = 1)
    public void testHeadingsOfEachSection(){
        Assert.assertEquals(homePage.buttomSectionHeading1(),"Trending Now","buttom section heading1 doesn't match");
        Assert.assertEquals(homePage.buttomSectionHeading2(),"Originals","buttom section heading2 doesn't match");

    }
    // Test whether the play button is displayed or not
    @Test(priority = 2)
    public void testPlayButtonIsDisplayed(){
        Assert.assertTrue(homePage.playButtonDisplayed().isDisplayed(),"Play button is not displayed");
    }

    // Test the Contact Us Section
    @Test(priority = 3)
    public void testContactUsSection(){
        // Test the ContactUs Text is displayed or not
        Assert.assertEquals(homePage.contactUsText(),"Contact Us","contact us text doesn't match");

        // Test the ContactUs Icons are displayed or not
        Assert.assertTrue(homePage.googleIconDisplayed().isDisplayed(),"Google icon is not displayed");
        Assert.assertTrue(homePage.twitterIconDisplayed().isDisplayed(),"Twitter icon is not displayed");
        Assert.assertTrue(homePage.instagramIconDisplayed().isDisplayed(),"Instagram icon is not displayed");
        Assert.assertTrue(homePage.youtubeIconDisplayed().isDisplayed(),"Youtube icon is not displayed");

    }

}