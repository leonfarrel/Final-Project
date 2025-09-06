package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.HomePage;

import static web_ui.stepdef.Driver.driver;

public class HomePageStepDef {

    HomePage homePage;

    @Given("user access the homepage")
    public void accessHomePage(){
        homePage = new HomePage(driver);
        homePage.goToHomePage();

    }

    @Then("user will be redirected to the homepage")
    public void validateTitle(){
        homePage.title_displayed();
    }

    @When("user click on the phone category button")
    public void phoneCategory(){
        homePage.click_phoneButton();
    }

    @Then("user will see phone list")
    public void phoneList(){
        homePage.phoneName_displayed();
    }

    @When("user click on the laptop category button")
    public void laptopCategory(){
        homePage.click_laptopButton();
    }

    @Then("user will see laptop list")
    public void laptopList(){
        homePage.laptopName_displayed();
    }

    @When("user click on the monitor category button")
    public void monitorCategory(){
        homePage.click_monitorButton();
    }

    @Then("user will see monitor list")
    public void monitorList(){
        homePage.monitorName_displayed();
    }

    @When("user click on next Button")
    public void clickNext(){
        homePage.click_next();
    }

    @Then("user will be redirected to the next page")
    public void validateNextPage(){
        homePage.previousButton_displayed();
    }

    @When("user click on the previous button")
    public void clickPrevious(){
        homePage.click_previous();
    }

    @Then("user will be redirected to the previous page")
    public void validatePreviousPage(){
        homePage.nextButton_displayed();
    }

    @When("user click on the product")
    public void accessProductDetailPage(){
        homePage.click_phoneName();
    }

    @When("user click on the About Us button")
    public void accessAboutUsPopUp(){
        homePage.click_aboutUsButton();
    }

    @When("user click on the Contact button")
    public void accessContactPopUp(){
        homePage.click_contact();
    }

    @When("user click on the Cart button")
    public void accessCartPage(){
        homePage.click_cartButton();
    }

    @When("user click on the Login button")
    public void accessLoginPopUp(){
        homePage.click_loginButton();
    }

    @When("user click on the Sign In button")
    public void accessSignInPopUp(){
        homePage.click_signInButton();
    }





}
