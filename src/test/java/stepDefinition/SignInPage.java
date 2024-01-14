package stepDefinition;
import static pages.SignInPage.*;

import io.cucumber.java.en.When;

public class SignInPage {
    @When("^User successfully enters then log in details$")
    public void user_logsin_to_login_page(){
        sendkeys_username();
        sendkeys_password();
        login_click_btn();
    }
}
