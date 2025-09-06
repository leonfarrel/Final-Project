import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"web_ui/stepdef"},
        features = {"src/test/resources/web-gherkin"},
        plugin ={"pretty", "html:reports/cucumber-web.html","json:reports/cucumber-web.json"}
)

public class RunWebTest {}
