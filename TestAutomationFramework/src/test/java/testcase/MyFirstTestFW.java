package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.ReadXLSdata;

import java.time.Duration;

public class MyFirstTestFW extends BaseTest {

    @Test(dataProviderClass = ReadXLSdata.class, dataProvider = "bvtdata") // use for data-driven test
    public static void LoginTest(String username, String password) throws InterruptedException {

        // ✅ Explicit wait defined here
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.findElement(By.linkText(Loc.getProperty("signin_link"))).click();

        // ✅ Wait until email field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Loc.getProperty("email_field"))));
        driver.findElement(By.id(Loc.getProperty("email_field"))).sendKeys(username);

        // ✅ Wait until next button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Loc.getProperty("next_button"))));
        driver.findElement(By.xpath(Loc.getProperty("next_button"))).click();

        // ✅ Wait until password field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Loc.getProperty("pwd_field"))));
        driver.findElement(By.xpath(Loc.getProperty("pwd_field"))).sendKeys(password);

        // ✅ Wait until login button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Loc.getProperty("login_next_button"))));
        driver.findElement(By.xpath(Loc.getProperty("login_next_button"))).click();

        Thread.sleep(3000); // Optional: for observation only
        // driver.close();
    }

//    @DataProvider(name = "testdata")
//    public Object[][] tData() {
//        return new Object[][] {
//            {"dsujo29@gmail.com", "Das##$$.we1965"},
//            {"dsuj209@gmail.com", "Das##$$.we1995"},
//            {"tthy@gmail.com", "Das##$$.we14844"},
//            {"dsujoy209@gmail.com", "Das##$$.we1965"}
//        };
//    }
}



