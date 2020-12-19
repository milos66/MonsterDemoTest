package www.test;

import org.testng.annotations.Test;
import pagecomponents.JobHeaderComponent;
import pageobjects.pages.HomePage;
import pageobjects.pages.SearchPhilipsJobsPage;

import java.util.List;

public class MonsterDemoTest extends MainTest {

//Almost every time, I am not able to fully scroll down, because it just stops loading new job offers,
//even it is still not at the end.
//Saved jobs are not displayed in "Saved jobs".

    @Test
    public static void demoTest() {

        new HomePage()
                .openHomePage()
                .createNewAccount()
                .fillDataForNewAccount()
                .clickOnPhilipsJobs();
        List<String> selectedJobs = new JobHeaderComponent().saveSecondAndLastJob();
        new SearchPhilipsJobsPage().openMySavedJobs().assertSavedJobs(selectedJobs);

    }
}
