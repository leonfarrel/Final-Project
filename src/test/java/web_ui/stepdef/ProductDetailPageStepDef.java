package web_ui.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.ProductDetailPage;

import static web_ui.stepdef.Driver.driver;

public class ProductDetailPageStepDef {

    ProductDetailPage productDetailPage;

    @Then("user will be redirected to the product detail page")
    public void validateAddCartButton(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addCartButton_displayed();
    }

    @When("user click on the add to cart button")
    public void clickAddCartButton(){
        productDetailPage.click_addCartButton();
    }

    @Then("user will be able to see a pop up message")
    public void validateMessage(){
        productDetailPage.message_displayed();
    }
}
