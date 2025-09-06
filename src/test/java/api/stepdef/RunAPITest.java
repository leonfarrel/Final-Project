import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"api/stepdef"},
        features = {"src/test/resources/api-gherkin"},
        plugin ={"pretty", "html:reports/cucumber-api.html","json:reports/cucumber-api.json"}
)

public class RunAPITest {}
