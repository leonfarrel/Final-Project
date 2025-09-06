package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.LoginPopUp;

import static web_ui.stepdef.Driver.driver;

public class LoginPopUpStepDef {

    LoginPopUp loginPopUp;

    @Then("user will see the Login Pop Up")
    public void validateLoginButton(){
        loginPopUp = new LoginPopUp(driver);
        loginPopUp.loginButton_displayed();
    }

    @When("user click on the Log in button")
    public void click_Login(){
        loginPopUp.click_loginButton();
    }

    @Then("user will be able to see name of user")
    public void validateNameOfUser(){
        loginPopUp.nameOfUser_displayed();
    }

    @And("user input registered username textbox with {string}")
    public void inputUsername(String username){
        loginPopUp.input_username(username);
    }

    @And("user input registered password textbox with {string}")
    public void inputPassword(String password){
        loginPopUp.input_password(password);
    }

    @When("user click on the Log out Button")
    public void clickLogout(){
        loginPopUp.click_logoutButton();
    }

    @When("user click on the close button at the Login Pop Up")
    public void clickClose(){
        loginPopUp.click_closeButton();
    }

    @Then("user will be able to see error message at the Login Pop Up")
    public void validateErrorMessage(){
        loginPopUp.errorMessage_displayed();
    }

    @Then("user will be able to see not registered username message")
    public void validateUnregisteredUsername(){
        loginPopUp.unregisteredErrorMessage_displayed();
    }

    @And("user input unregistered username textbox with {string}")
    public void inputUnregisteredUsername(String username){
        loginPopUp.unregistered_username(username);
    }

    @And("user input incorrect password textbox with {string}")
    public void inputIncorrectPassword(String password){
        loginPopUp.wrong_password(password);
    }

    @Then("user will be able to see wrong password message")
    public void wrongPasswordMessage(){
        loginPopUp.wrongPassword_message();
    }


}
