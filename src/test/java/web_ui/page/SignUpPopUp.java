package web_ui.page;

import io.cucumber.java.cs.Ale;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SignUpPopUp {

    WebDriver driver;

    By signUpButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By usernameTextbox = By.cssSelector("input#sign-username");
    By passwordTextBox = By.cssSelector("input#sign-password");
    By closeButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");

    public SignUpPopUp(WebDriver driver){
        this.driver = driver;
    }

    public void signUpButton_displayed(){
        assertTrue(driver.findElement(signUpButton).isDisplayed());
    }

    public void message_displayed(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "Sign up successful.",
                "Alert did not Match !");

        alert.accept();
    }
    public void errorMessage_displayed(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message,"Please fill out Username and Password.",
                "Alert did not Match !");

        alert.accept();
    }

    public void usedUsernameMessage_displayed(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "This user already exist.",
                "Alert did not match !");

        alert.accept();
    }

    public void input_Username(String username){
        driver.findElement(usernameTextbox).sendKeys("leontest22"); //Change for test
    }

    public void input_usedUsername(String username){
        driver.findElement(usernameTextbox).sendKeys("leontest1");
    }
    public void input_Password(String password){
        driver.findElement(passwordTextBox).sendKeys("password123");
    }

    public void click_signUpButton(){
        driver.findElement(signUpButton).click();
    }

    public void click_closeButton(){
        driver.findElement(closeButton).click();
    }


}
