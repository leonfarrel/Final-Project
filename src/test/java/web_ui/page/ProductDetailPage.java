package web_ui.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

import static org.testng.AssertJUnit.assertTrue;

public class ProductDetailPage {

    WebDriver driver;

    By addCartButton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
    }

    public void addCartButton_displayed(){
        assertTrue(driver.findElement(addCartButton).isDisplayed());
    }

    public void click_addCartButton(){
        driver.findElement(addCartButton).click();
    }

    public void message_displayed(){
        Alert alert = driver.switchTo().alert();

        String actualMessage = alert.getText();

        assertEquals(actualMessage, "Product added",
                "Alert did not Match !");

        alert.accept();

    }
}
