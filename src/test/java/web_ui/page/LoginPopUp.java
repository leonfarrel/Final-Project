package web_ui.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPopUp {

    WebDriver driver;

    By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By nameOfUser = By.id("nameofuser");
    By usernameTextbox = By.cssSelector("input#loginusername");
    By passwordTextbox = By.cssSelector("input#loginpassword");
    By logout = By.id("logout2");
    By closeButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");

    public LoginPopUp(WebDriver driver){
        this.driver = driver;
    }

    public void loginButton_displayed(){
        assertTrue(driver.findElement(loginButton).isDisplayed());
    }

    public void click_loginButton(){
        driver.findElement(loginButton).click();
    }

    public void nameOfUser_displayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait max 10s
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOfUser));
        assertTrue(driver.findElement(nameOfUser).isDisplayed());
    }

    public void input_username(String username){
        driver.findElement(usernameTextbox).sendKeys("leontest1");
    }

    public void input_password(String password){
        driver.findElement(passwordTextbox).sendKeys("password123");
    }

    public void click_logoutButton(){
        driver.findElement(logout).click();
    }
    public void click_closeButton(){
        driver.findElement(closeButton).click();
    }

    public void errorMessage_displayed(){
        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "Please fill out Username and Password.",
                "Alert did not match !");

        alert.accept();
    }

    public void unregisteredErrorMessage_displayed(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "User does not exist.",
                "Alert did not match !");

        alert.accept();
    }

    public void unregistered_username(String username){

        driver.findElement(usernameTextbox).sendKeys("testingtheunregisteredusername");

    }

    public void wrong_password(String password){
        driver.findElement(passwordTextbox).sendKeys("wrongpassword123");
    }

    public void wrongPassword_message(){

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        assertEquals(message, "Wrong password.",
                "Alert not found");

        alert.accept();
    }
}
