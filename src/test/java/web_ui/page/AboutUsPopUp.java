package web_ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class AboutUsPopUp {

    WebDriver driver;

    By closeButton = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");

    public AboutUsPopUp(WebDriver driver){
        this.driver = driver;
    }

    public void closeButton_displayed(){
        assertTrue(driver.findElement(closeButton).isDisplayed());
    }
}
