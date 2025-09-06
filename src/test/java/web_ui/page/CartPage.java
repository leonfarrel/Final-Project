package web_ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class CartPage {

    WebDriver driver;

    By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By deleteProduct1 = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void placeOrderButton_displayed(){
        assertTrue(driver.findElement(placeOrderButton).isDisplayed());
    }

    public void click_placeOrderButton(){
        driver.findElement(placeOrderButton).click();
    }

    public void delete_Product1(){
        driver.findElement(deleteProduct1).click();
    }

    public void deleteProduct1Button_notDisplayed(){
        assertTrue(driver.findElements(deleteProduct1).isEmpty());
    }


}
