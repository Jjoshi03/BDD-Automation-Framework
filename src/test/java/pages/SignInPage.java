package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage extends BrowserDriver {

    public static String username_text_xpath="//*[@id=\"usr\"]";
    public static String password_text_xpath="//*[@id=\"pwd\"]";
    public static String login_btn_xpath="//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath="//*[@id=\"NewRegistration\"]";

    public static void sendkeys_username(){
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("janki");
    }

    public static void sendkeys_password(){
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("1234");
    }

    public static void login_click_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void registration_click_btn(){
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }



}
