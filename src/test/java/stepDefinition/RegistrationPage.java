package stepDefinition;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.visibility_registrationHead;

public class RegistrationPage {
    @Then("^User should be able to view the Registration page$")
    public void user_view_registration_page()
    {
        String actualRegistrationPageheading= visibility_registrationHead();
        assertEquals(actualRegistrationPageheading,"User Registration Page");
    }
}
