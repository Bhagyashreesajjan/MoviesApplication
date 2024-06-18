package org.actualPages;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MoviesAppTestReports.class)
public class MovieDetailsPageTest extends  BaseTest{

    @Test(priority = 1)
    public void testHomePageOneMovie(){
        // navigation to one movie on homepage
        movieDetailsPage.clickOnHomePageMovie();

        // Test the Website logo is displayed or not
        Assert.assertTrue(homePage.websiteLogo().isDisplayed(),"Website logo is not displayed");

        // verify the text of navbar elements
        Assert.assertEquals(homePage.navbarElement1text(),"Home","Navbar element text doesn't match");
        Assert.assertEquals(homePage.navbarElement2text(),"Popular","Navbar element text doesn't match");

        // test the user profile image is displayed or not
        Assert.assertTrue(movieDetailsPage.profileImg().isDisplayed(),"profile image is not displayed");

        // test the background image is displayed or not
        Assert.assertTrue(movieDetailsPage.movieBackgroundImgDisplayed().isDisplayed(),"Background image is not displayed");

        // test the movie title text matched or not
        Assert.assertEquals(movieDetailsPage.movieTitle(),"Death Proof","Movie Title text does not match");

        // test the movie duration matched or not
        Assert.assertEquals(movieDetailsPage.movieDuration(),"1h 53m","Movie duration doesn't match");

        // test the movie description matched or not
        Assert.assertEquals(movieDetailsPage.movieDescription(),"Austin's hottest DJ, Jungle Julia, sets out into the night to unwind with her two friends Shanna and Arlene. Covertly tracking their moves is Stuntman Mike, a scarred rebel leering from behind the wheel of his muscle car, revving just feet away.","Movie description does not match");

        // test the play button displayed or not
        Assert.assertTrue(movieDetailsPage.playButtonDisplayed().isDisplayed(),"Play button is not displayed");

        // Test the ContactUs Icons are displayed or not
        Assert.assertTrue(homePage.googleIconDisplayed().isDisplayed(),"Google icon is not displayed");
        Assert.assertTrue(homePage.twitterIconDisplayed().isDisplayed(),"Twitter icon is not displayed");
        Assert.assertTrue(homePage.instagramIconDisplayed().isDisplayed(),"Instagram icon is not displayed");
        Assert.assertTrue(homePage.youtubeIconDisplayed().isDisplayed(),"Youtube icon is not displayed");

        // Test the ContactUs Text is displayed or not
        Assert.assertEquals(homePage.contactUsText(),"Contact Us","contact us text doesn't match");



    }

    @Test(priority = 2)
    public void testPopularPageOneMovie(){
        // navigation to popular page
        movieDetailsPage.clickOnPopularPage();

        // click one movie on popular page
        movieDetailsPage.clickOnPopluarpageMovie();

        // Test the Website logo is displayed or not
        Assert.assertTrue(homePage.websiteLogo().isDisplayed(),"Website logo is not displayed");
        // verify the text of navbar elements
        Assert.assertEquals(homePage.navbarElement1text(),"Home","Navbar element text doesn't match");
        Assert.assertEquals(homePage.navbarElement2text(),"Popular","Navbar element text doesn't match");
        // test the user profile image is displayed or not
        Assert.assertTrue(movieDetailsPage.profileImg().isDisplayed(),"profile image is not displayed");


        // test the background image is displayed or not
        Assert.assertTrue(movieDetailsPage.movieBackgroundImgDisplayed().isDisplayed(),"Background image is not displayed");

        // test the movie title text matched or not
        Assert.assertEquals(movieDetailsPage.movieTitle(),"Luca","Movie title text does not match");

        // test the movie duration matched or not
        Assert.assertEquals(movieDetailsPage.movieDuration(),"2h 7m","Movie duration doesn't match");

        // test the movie description matched or not
        Assert.assertEquals(movieDetailsPage.movieDescription(),"Luca and his best friend Alberto experience an unforgettable summer on the Italian Riviera. But all the fun is threatened by a deeply-held secret: they are sea monsters from another world just below the water’s surface.","Movie discription text does not match");

        // test the play button displayed or not
        Assert.assertTrue(movieDetailsPage.playButtonDisplayed().isDisplayed(),"Play button is not displayed");

        // Test the ContactUs Icons are displayed or not
        Assert.assertTrue(homePage.googleIconDisplayed().isDisplayed(),"Google icon is not displayed");
        Assert.assertTrue(homePage.twitterIconDisplayed().isDisplayed(),"Twitter icon is not displayed");
        Assert.assertTrue(homePage.instagramIconDisplayed().isDisplayed(),"Instagram icon is not displayed");
        Assert.assertTrue(homePage.youtubeIconDisplayed().isDisplayed(),"Youtube icon is not displayed");
        // Test the ContactUs Text is displayed or not
        Assert.assertEquals(homePage.contactUsText(),"Contact Us","contact us text doesn't match");

    }



}