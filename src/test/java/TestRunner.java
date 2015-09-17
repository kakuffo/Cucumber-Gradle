/**
 * Created by kakuffo on 17/09/15.
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
        features = "src/test/java/com/whiteleys/zoo/features")

public class TestRunner {

}
