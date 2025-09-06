package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.CartPage;

import static web_ui.stepdef.Driver.driver;

public class CartPageStepDef {

    CartPage cartPage;

    @Then("user will be redirected to the cart page")
    public void validatePlaceOrderButton(){
        cartPage = new CartPage(driver);
        cartPage.placeOrderButton_displayed();
    }

    @When("user click on the Place Order Button")
    public void placeOrder(){
        cartPage.click_placeOrderButton();
    }

    @When("user click on the delete button on the 1st Product")
    public void deleteProduct1(){
        cartPage.delete_Product1();
    }

    @Then("The corresponding product will be remove")
    public void validateRemoveProduct(){
        cartPage.deleteProduct1Button_notDisplayed();
    }

}
