package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.SignUpPopUp;

import static web_ui.stepdef.Driver.driver;

public class SignUpPopUpStepDef {

    SignUpPopUp signUpPopUp;

    @Then("user will see the Sign In Pop Up")
    public void validateSignUpButton(){
        signUpPopUp = new SignUpPopUp(driver);
        signUpPopUp.signUpButton_displayed();
    }

    @And("user input username textbox with {string}")
    public void inputUsername(String username){
        signUpPopUp.input_Username(username);
    }
    @And("user input password textbox with {string}")
    public void inputPassword(String password){
        signUpPopUp.input_Password(password);
    }

    @When("user click on the Sign Up Button")
    public void clickSignUp(){
        signUpPopUp.click_signUpButton();
    }

    @Then("user will be able to see success message")
    public void validateMessage(){
        signUpPopUp.message_displayed();
    }

    @Then("user will be able to see error message at the Sign up Pop Up")
    public void validateErrorMessage(){
        signUpPopUp.errorMessage_displayed();
    }

    @Then("user will be able to see used username message")
    public void validateUsedUsernameMessage(){
        signUpPopUp.usedUsernameMessage_displayed();
    }

    @And("user input username textbox with used username {string}")
    public void input_usedUsername(String username){
        signUpPopUp.input_usedUsername(username);
    }

    @When("user click on the close button at the Sign Up Pop Up")
    public void closeSignUpPopUp(){
        signUpPopUp.click_closeButton();
    }


}
