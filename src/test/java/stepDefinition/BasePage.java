package stepDefinition;
import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class BasePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_Login_page() throws Throwable{
        click_hamburger_menu();
        click_SignIn_link();
    }
}
