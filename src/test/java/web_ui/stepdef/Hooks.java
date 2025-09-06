package web_ui.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.ui.WebDriverWait;
import web_ui.stepdef.Driver;

import java.time.Duration;

public class Hooks extends Driver {

    @Before
    public void beforeTest(){
        getDriverHeadless();//Change to getDriverHeadless() to use the Headless option
    }

    @After
    public void afterTest() throws InterruptedException {
//        Thread.sleep(2000);
        driver.close();
    }
    @AfterStep
    public void afterStep() throws InterruptedException {
        Thread.sleep(1000);
    }


}
