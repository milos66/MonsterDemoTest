package pagecomponents;

import com.codeborne.selenide.SelenideElement;
import pageobjects.pages.SearchPhilipsJobsPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FooterComponent {

    private final SelenideElement philipsJobs = $(byText("Philips Jobs"));

    public SearchPhilipsJobsPage clickOnPhilipsJobs() {
        philipsJobs.scrollIntoView(false).click();
        return new SearchPhilipsJobsPage();
    }

}
