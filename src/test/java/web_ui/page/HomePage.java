package web_ui.page;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class HomePage {

    WebDriver driver;

    By homeTitle = By.id("nava");
    By rightCarouselButton = By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[2]/span[1]");
    By leftCarouselButton = By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[1]/span[1]");
    By banner2 = By.xpath("//*[@id=\"carouselExampleIndicators\"]/div/div[2]/img");
    By banner3 = By.xpath("//*[@id=\"carouselExampleIndicators\"]/div/div[3]/img");
    By phoneButton = By.xpath("//*[@id=\"itemc\"]");
    By phoneName = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By laptopButton = By.xpath("//a[@class='list-group-item' and text()='Laptops']");
    By laptopName = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By monitorButton = By.xpath("//a[@class='list-group-item' and text()='Monitors']");
    By monitorName = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By next = By.id("next2");
    By prev = By.id("prev2");

    // Top Navigation Option
    By aboutUs = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a");
    By contact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By cart = By.id("cartur");
    By login = By.id("login2");
    By signIn = By.id("signin2");


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.get("https://demoblaze.com/");
    }
    public void title_displayed(){
        assertTrue(driver.findElement(homeTitle).isDisplayed());
    }
    public void click_rightButton(){
        driver.findElement(rightCarouselButton).click();
    }
    public void bannerMoveRight(){
        assertTrue(driver.findElement(banner2).isDisplayed());
    }
    public void bannerMoveLeft(){
        assertTrue(driver.findElement(banner3).isDisplayed());
    }
    public void click_leftButton(){
        driver.findElement(leftCarouselButton).click();
    }

    public void click_phoneButton(){
        driver.findElement(phoneButton).click();
    }

    public void phoneName_displayed(){
        assertTrue(driver.findElement(phoneName).isDisplayed());
    }
    public void click_laptopButton(){
        driver.findElement(laptopButton).click();
    }

    public void laptopName_displayed(){
        assertTrue(driver.findElement(laptopName).isDisplayed());
    }

    public void click_monitorButton(){
        driver.findElement(monitorButton).click();
    }

    public void monitorName_displayed(){
        assertTrue(driver.findElement(monitorName).isDisplayed());
    }

    public void click_next(){
        driver.findElement(next).click();
    }

    public void click_previous(){
        driver.findElement(prev).click();
    }

    public void previousButton_displayed(){
        assertTrue(driver.findElement(prev).isDisplayed());
    }

    public void nextButton_displayed(){
        assertTrue(driver.findElement(next).isDisplayed());
    }

    public void click_phoneName(){
        driver.findElement(phoneName).click();
    }

    public void click_aboutUsButton(){
        driver.findElement(aboutUs).click();
    }

    public void click_contact(){
        driver.findElement(contact).click();
    }

    public void click_cartButton(){
        driver.findElement(cart).click();
    }

    public void click_loginButton(){
        driver.findElement(login).click();
    }
    public void click_signInButton(){
        driver.findElement(signIn).click();
    }




}
