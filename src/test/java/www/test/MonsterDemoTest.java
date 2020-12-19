package www.test;

import org.testng.annotations.Test;
import pagecomponents.FooterComponent;
import pageobjects.pages.HomePage;
import pageobjects.pages.SearchPhilipsJobsPage;
import teststeps.SaveJobStep;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class MonsterDemoTest extends MainTest {

//Almost every time, I am not able to fully scroll down, because it just stops loading new job offers,
//even it is still not at the end.
//Saved jobs are not displayed in "Saved jobs".

    @Test
    public static void demoTest() {

        new HomePage()
                .openHomePage()
                //.loginUser();
                .createNewAccount()
                .fillDataForNewAccount()
        //new FooterComponent()
                .clickOnPhilipsJobs();
        List<String> selectedJobs = new SaveJobStep().saveSecondAndLastJob();
        new SearchPhilipsJobsPage().openMySavedJobs().assertSavedJobs(selectedJobs);
        System.out.println(selectedJobs);

    }
}
