package stepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.SignInPage.registration_click_btn;
import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visibility_registrationHead;

public class RegistrationPage1 {
    @When("^User click on new registration button$")
    public void clickRegistrationButton()
    {
        registration_click_btn();
    }
}