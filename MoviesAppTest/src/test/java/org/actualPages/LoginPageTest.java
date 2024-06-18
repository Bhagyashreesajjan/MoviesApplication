package org.actualPages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MoviesAppTestReports.class)
public class LoginPageTest {
    public WebDriver driver;
    LoginPage  loginPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    // Test the Login Page UI
    @Test(priority = 1)
    public void testLoginPageUI(){
        Assert.assertTrue(loginPage.appLogo().isDisplayed(),"App logo is not displayed");
        Assert.assertEquals(loginPage.headingText(),"Login","Heading text does not match");
        Assert.assertEquals(loginPage.userNameLabelText(),"USERNAME");
        Assert.assertEquals(loginPage.passwordLabelText(),"PASSWORD");
        Assert.assertTrue(loginPage.loginButtonIsEnabled().isEnabled(),"Login button is enabled");
    }

    // Test the Login Page Functionalities
    @Test(priority = 2)
    public void testLoginWithEmptyInputs(){
        loginPage.loginToApplication("","");
        Assert.assertEquals(loginPage.errorMessage(),"*Username or password is invalid","Error text with empty input fields does not match");

    }

    @Test(priority = 3)
    public void testLoginWithEmptyUsername(){
        loginPage.loginToApplication("","rahul@2021");
        Assert.assertEquals(loginPage.errorMessage(),"*Username or password is invalid","Error text with empty username input field does not match");

    }

    @Test(priority = 4)
    public void testLoginWithEmptyPassword(){
        loginPage.loginToApplication("rahul","");
        Assert.assertEquals(loginPage.errorMessage(),"*Username or password is invalid","Error text with empty password input field does not match");
    }

    @Test(priority = 4)
    public void testLoginWithInvalidCred(){
        loginPage.loginToApplication("rahul","rahul2021");
        Assert.assertEquals(loginPage.errorMessage(),"*username and password didn't match","Error text with invalid credentials field does not match");
    }

    @Test(priority = 5)
    public void testLoginWithValidCred(){
        loginPage.loginToApplication("rahul","rahul@2021");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://qamoviesapp.ccbp.tech/","URLs do not match");

    }

}