package Pages.listing;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import static Constants.Constant.Amount.CARD_AMOUNT;

public class ListingFlights extends BasePage {

    public ListingFlights(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='css-4o3ibe']");

    public ListingFlights checkFlightsCards () {
        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards,CARD_AMOUNT);
        return this;
    }
}
