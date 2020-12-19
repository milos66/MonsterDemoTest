package pagecomponents;

import com.codeborne.selenide.SelenideElement;
import pageobjects.pages.SavedJobsPage;

import static com.codeborne.selenide.Selenide.$x;

public class NavigationBarComponent {

    private final SelenideElement myJobSearch = $x("//*[contains(text(),'My Job Search')]");
    private final SelenideElement savedJobs = $x("//*[text()='Saved Jobs']");

    public SavedJobsPage openMySavedJobs() {
        myJobSearch.hover();
        savedJobs.click();
        return new SavedJobsPage();
    }

}
