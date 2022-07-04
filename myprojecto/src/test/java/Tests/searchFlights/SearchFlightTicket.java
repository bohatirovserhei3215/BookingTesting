package Tests.searchFlights;

import Pages.base.BasePage;
import Pages.flights_page.FlightsPage;
import Pages.listing.ListingFlights;
import Tests.base.BaseTest;
import org.testng.annotations.Test;


import static Constants.Constant.Urls.MAIN_BOOKING_PAGE;

public class SearchFlightTicket extends BaseTest {

    @Test
    public void checkAppearanceOfFlightsPage() {
        basePages.open(MAIN_BOOKING_PAGE);

        flightsPage
                .CookiesAccept()
                .FlightsPageButton()
                .ClickWhereFrom()
                .clickClearField()
                .inputBoxWhereFrom()
                .inputBoxWhereTo()
                .searchButton();

 //       listingFlights
   //             .checkFlightsCards();
    }


}
