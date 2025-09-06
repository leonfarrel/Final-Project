package web_ui.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web_ui.page.ContactPopUp;

import static web_ui.stepdef.Driver.driver;

public class ContactPopUpStepDef {

    ContactPopUp contactPopUp;

    @Then("user will see the Contact Pop Up")
    public void validateSendMessageButton(){
        contactPopUp = new ContactPopUp(driver);
        contactPopUp.sendMessageButton_displayed();
    }

    @And("user input email textbox with {string}")
    public void inputMail(String mail){
        contactPopUp.input_email(mail);
    }

    @And("user input name textbox at contact pop up with {string}")
    public void inputName(String name){
        contactPopUp.input_name(name);
    }

    @And("user input message textbox with {string}")
    public void inputMessage(String message){
        contactPopUp.input_message(message);
    }

    @When("user click on the send message button")
    public void clickSend(){
        contactPopUp.click_sendMessageButton();
    }

    @Then("user will see a success feedback message")
    public void validateFeedbackMessage(){
        contactPopUp.feedbackMessage_displayed();
    }

    @When("user click on the close button")
    public void closePopUp(){
        contactPopUp.click_closeButton();
    }

}
