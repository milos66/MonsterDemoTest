package pagecomponents;

import pageobjects.pages.SearchPhilipsJobsPage;

import java.util.List;

import static java.util.Arrays.asList;

public class JobHeaderComponent {


    SearchPhilipsJobsPage searchPhilipsJobsPage = new SearchPhilipsJobsPage();

    public List<String> saveSecondAndLastJob() {
        return asList(saveSecondJob(), saveLastPhilipsJob());
    }

    public String saveSecondJob() {
        return searchPhilipsJobsPage
                .selectSecondJob()
                .saveSelectedJob()
                .checkNotification()
                .getJobName(1);
    }

    public String saveLastPhilipsJob() {
        return searchPhilipsJobsPage
                .selectLastSearchedJob()
                .saveSelectedJob()
                .checkNotification()
                .getJobName(searchPhilipsJobsPage.getNumberOfJobs() - 1);
    }

}
