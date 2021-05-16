package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, publish = true, tags = "@junit")
public class RunCucumberTest {

}
