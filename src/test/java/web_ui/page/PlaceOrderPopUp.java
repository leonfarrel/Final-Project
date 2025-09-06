package web_ui.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class PlaceOrderPopUp {

    WebDriver driver;

    By purchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By title = By.id("orderModalLabel");
    By nameTextbox = By.id("name");
    By countryTextbox = By.id("country");
    By cityTextbox = By.id("city");
    By creditCardTextbox = By.id("card");
    By monthTextbox = By.id("month");
    By yearTextbox = By.id("year");
    By confirmMessage = By.xpath("/html/body/div[10]/div[7]/div/button");
    By closeButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");


    public PlaceOrderPopUp(WebDriver driver){
        this.driver = driver;
    }

    public void popUp_displayed(){
        assertTrue(driver.findElement(title).isDisplayed());
    }
    public void click_purchaseButton(){
        driver.findElement(purchaseButton).click();
    }

    public void input_name(String name){
        driver.findElement(nameTextbox).sendKeys("Leon Farrel");
    }
    public void input_country(String country){
        driver.findElement(countryTextbox).sendKeys("Indonesia");
    }
    public void input_city(String city){
        driver.findElement(cityTextbox).sendKeys("Denpasar");
    }
    public void input_creditCard(String card){
        driver.findElement(creditCardTextbox).sendKeys("12345678");
    }
    public void input_month(String month){
        driver.findElement(monthTextbox).sendKeys("April");
    }
    public void input_year(String year){
        driver.findElement(yearTextbox).sendKeys("2025");
    }

    public void confirmMessage_displayed(){
        driver.findElement(confirmMessage).click();
    }

    public void error_message(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "Please fill out Name and Creditcard.",
                "Alert not found");

        alert.accept();
    }

    public void click_closeButton(){
        driver.findElement(closeButton).click();
    }


}
