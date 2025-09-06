package web_ui.page;

import io.cucumber.java.bs.A;
import io.cucumber.java.cs.Ale;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ContactPopUp {

    WebDriver driver;

    By sendMessageButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By emailTextbox = By.id("recipient-email");
    By contactName = By.id("recipient-name");
    By messageTextbox = By.id("message-text");
    By closeButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");

    public ContactPopUp(WebDriver driver){
        this.driver = driver;
    }

    public void sendMessageButton_displayed(){
        assertTrue(driver.findElement(sendMessageButton).isDisplayed());
    }

    public void input_email(String mail){
        driver.findElement(emailTextbox).sendKeys("leon@test.com");
    }

    public void input_name(String name){
        driver.findElement(contactName).sendKeys("Leon");
    }

    public void input_message(String message){
        driver.findElement(messageTextbox).sendKeys("Hello World");
    }

    public void click_sendMessageButton(){
        driver.findElement(sendMessageButton).click();
    }

    public void click_closeButton(){
        driver.findElement(closeButton).click();
    }

    public void feedbackMessage_displayed(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "Thanks for the message!!",
                "Alert not found");

        alert.accept();
    }


}
