package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import dataobjects.GenerateData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CreateAccountPage {

    private final SelenideElement emailAddress = $x("//*[@id='c_elem_0']");
    private final SelenideElement newPassword = $x("//*[@id='a_elem_1']");
    private final SelenideElement passwordConfirmation = $x("//*[@id='a_elem_2']");
    private final SelenideElement jobCorpsCenter = $x("//*[@id='elem_3']");
    private final SelenideElement termsAndConditions = $x("//*[@id='id_option_label_elem_5-true']");
    private final SelenideElement createAccountButton = $(byText("Create an account"));

    public DashboardPage fillDataForNewAccount() {

        emailAddress.setValue(GenerateData.generateEmail(20));
        newPassword.setValue("Password.1234");
        passwordConfirmation.setValue("Password.1234");
        jobCorpsCenter.selectOption(1);
        termsAndConditions.click();
        createAccountButton.click();
        sleep(3000);
        return new DashboardPage();

    }

}
