package web_ui.stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    protected static WebDriver driver;

    protected void getDriver(){
        ChromeOptions options = new ChromeOptions();


        driver = WebDriverManager.chromedriver().create();
    }

    protected void getDriverHeadless(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
    }


}
