package workflow1.Ecom2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		format = {"pretty", "json:target/cucumber.json"},
		//tags = {"~@ignore"},
		tags = {"@Login, @ForgotPsw, @Register"},
		strict = false
)
public class RunnerTest {



}
