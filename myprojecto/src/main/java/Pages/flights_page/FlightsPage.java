package Pages.flights_page;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.Constant.Destinations.WHERE_FROM;
import static Constants.Constant.Destinations.WHERE_TO;

public class FlightsPage extends BasePage {

    public FlightsPage(WebDriver driver) {
        super(driver);
    }

    private final By FlightsButton = By.xpath("//a[@rel='nofollow']//span[@class='bui-tab__text']");
    private final By NotClearedWhereFrom = By.xpath("//div[@class='css-hm3w49']");
    private final By ClearField =By.xpath("//span[@class='Icon-module__root___2wFGg Icon-module__root--size-smaller___2oxC5']");
    private final By InputBoxWhere = By.xpath("//input[@class='css-1tl2oa1']");
    private final By CheckBoxAfterSearch = By.xpath("//div[@class='css-1lc7njo']");
    private final By ButtonSearch = By.xpath("//button[@class='css-ya5gr9 wide']");
    private final By CookieAccept = By.xpath("//button[@id='onetrust-accept-btn-handler']");

    public FlightsPage CookiesAccept () {
        WebElement cookieButton = driver.findElement(CookieAccept);
        waitElementIsVisible(cookieButton).click();

        return this;
    }

    public  FlightsPage FlightsPageButton (){
        driver.findElement(FlightsButton).click();

        return this;
    }

    public  FlightsPage ClickWhereFrom (){
        driver.findElement(NotClearedWhereFrom).click();

        return this;
    }

    public FlightsPage clickClearField (){
        driver.findElement(ClearField).click();

        return this;
    }

    public FlightsPage inputBoxWhereFrom (){
        WebElement inputPlace = driver.findElement(InputBoxWhere);
        inputPlace.click();
        waitElementIsVisible(inputPlace).sendKeys(WHERE_FROM);

        WebElement check = driver.findElement(CheckBoxAfterSearch);
        waitElementIsVisible(check);
        check.click();

        return this;
    }

    public FlightsPage inputBoxWhereTo (){
        WebElement input  = driver.findElement(InputBoxWhere);
        input.sendKeys(WHERE_TO);
        driver.findElement(CheckBoxAfterSearch).click();

        return this;
    }

    public FlightsPage searchButton (){
        driver.findElement(ButtonSearch).click();

        return this;
    }
}
