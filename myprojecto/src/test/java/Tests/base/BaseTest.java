package Tests.base;

import Common.CommonActions;
import Pages.base.BasePage;
import Pages.flights_page.FlightsPage;
import Pages.listing.ListingFlights;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static Common.Config.TimeoutVariable.CLEAR_COOKIES_AND_STORAGE;
import static Common.Config.TimeoutVariable.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage  basePages = new BasePage(driver);
    protected FlightsPage flightsPage = new FlightsPage(driver);
    protected ListingFlights listingFlights = new ListingFlights(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage (){
        if(CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {

        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }
}
