package pageobjects.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;


public class SavedJobsPage {

    private final ElementsCollection savedJobs = $$x("//h2/a");

    public void assertSavedJobs(List<String> namesOfSavedJobs) {

        savedJobs.shouldBe(CollectionCondition.textsInAnyOrder(namesOfSavedJobs));
    }
}