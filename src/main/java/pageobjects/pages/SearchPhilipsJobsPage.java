package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pagecomponents.NavigationBarComponent;

import static com.codeborne.selenide.Selenide.*;

public class SearchPhilipsJobsPage extends NavigationBarComponent {

    private final ElementsCollection allSearchedJobs = $$x("//*[@id='SearchResults']/section//h2/a");
    private final SelenideElement saveButton = $x("//*[@id='SaveJob']");
    private final SelenideElement secondJob = $x("//*[@id='SearchResults']/section[2]");
    private final SelenideElement notification = $x("//p[text()='Job has been saved to your account.']");
    private final SelenideElement allJobsDisplayed = $x("//*[@id='noMoreResults']");


    public SearchPhilipsJobsPage selectLastSearchedJob() {
        do {
            allSearchedJobs.get(allSearchedJobs.size() - 1).scrollIntoView(true);
            sleep(3000);
        } while (!allJobsDisplayed.isDisplayed());

        sleep(3000);
        allSearchedJobs.get(allSearchedJobs.size() - 1).scrollIntoView(true).click();
        return this;
    }

    public SearchPhilipsJobsPage selectSecondJob() {
        secondJob.click();
        return this;
    }

    public String getJobName(int jobNumber) {
        return allSearchedJobs.get(jobNumber).text();
    }

    public int getNumberOfJobs() {
        return allSearchedJobs.size();
    }

    public SearchPhilipsJobsPage saveSelectedJob() {
        saveButton.click();
        return this;
    }

    public SearchPhilipsJobsPage checkNotification() {
        notification.shouldBe(Condition.visible);
        return this;
    }

}
