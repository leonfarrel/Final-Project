package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.PlaceOrderPopUp;

import static web_ui.stepdef.Driver.driver;

public class PlaceOrderPopUpStepDef {

    PlaceOrderPopUp placeOrderPopUp;

    @Then("user will see the Place Order Pop up")
    public void validateTitle(){
        placeOrderPopUp = new PlaceOrderPopUp(driver);
        placeOrderPopUp.click_closeButton();
    }

    @And("user input name textbox with {string}")
    public void inputName(String name){
        placeOrderPopUp = new PlaceOrderPopUp(driver);
        placeOrderPopUp.input_name(name);
    }

    @And("user input country textbox with {string}")
    public void inputCountry(String country){
        placeOrderPopUp.input_country(country);
    }

    @And("user input city textbox with {string}")
    public void inputCity(String city){
        placeOrderPopUp.input_city(city);
    }

    @And("user input credit card textbox with {string}")
    public void inputCard(String card){
        placeOrderPopUp.input_creditCard(card);
    }

    @And("user input month textbox with {string}")
    public void inputMonth(String month){
        placeOrderPopUp.input_month(month);
    }

    @And("user input year textbox with {string}")
    public void inputYear(String year){
        placeOrderPopUp.input_year(year);
    }

    @When("user click on the Purchase Button")
    public void purchase(){
        placeOrderPopUp = new PlaceOrderPopUp(driver);
        placeOrderPopUp.click_purchaseButton();
    }

    @Then("user will see a success message")
    public void validateConfirmMessage(){
        placeOrderPopUp.confirmMessage_displayed();
    }
    @Then("user will see a error message")
    public void validateErrorMessage(){
        placeOrderPopUp.error_message();
    }

    @When("user click on the close button at the Place Order Pop Up")
    public void closePopUp(){
        placeOrderPopUp = new PlaceOrderPopUp(driver);
        placeOrderPopUp.click_closeButton();
    }



}
