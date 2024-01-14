package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static ChromeOptions options;
    public BrowserDriver()
    {
        options=new ChromeOptions();
        options.addArguments("--headless--");
        options.addArguments("--remote-allow-origins=*");
        //System.setProperty("webdriver.http.factory","jdk-http-client");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver");
        this.driver=new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }

    public void close()
    {
        this.driver.close();
    }


}
