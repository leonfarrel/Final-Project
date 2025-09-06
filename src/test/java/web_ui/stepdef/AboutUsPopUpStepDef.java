package web_ui.stepdef;

import io.cucumber.java.en.Then;
import web_ui.page.AboutUsPopUp;

import static web_ui.stepdef.Driver.driver;

public class AboutUsPopUpStepDef {

    AboutUsPopUp aboutUsPopUp;

    @Then("user will see the About us Pop Up")
    public void validateCloseButton(){
        aboutUsPopUp = new AboutUsPopUp(driver);
        aboutUsPopUp.closeButton_displayed();
    }
}
