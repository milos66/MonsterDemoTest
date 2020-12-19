package pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import pagecomponents.FooterComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends FooterComponent {

    private final SelenideElement createAccountButton = $(byText("CREATE ACCOUNT"));
    private final SelenideElement signIn = $x("//*[@ng-click='showLoginModal()']");
    private final SelenideElement setUserName = $x("//*[@id='a_elem_0']");
    private final SelenideElement setPassword = $x("//*[@id='a_elem_1']");

    public HomePage openHomePage() {
        open("/home");
        return new HomePage();
    }

    public void loginUser() {

        signIn.click();
        setUserName.setValue("abc@test.test");
        setPassword.setValue("Password.1234").sendKeys(Keys.ENTER);
    }

    public CreateAccountPage createNewAccount() {

        createAccountButton.click();
        return new CreateAccountPage();

    }

}
