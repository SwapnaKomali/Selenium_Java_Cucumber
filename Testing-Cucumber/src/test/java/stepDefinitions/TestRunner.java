package stepDefinitions;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/PlaceOrder.Feature",glue={"StepDefinations"},monochrome=true,
plugin = {"pretty","html:target/HtmlReports/index.html","junit:target/JunitReports/junit.xml"},tags="@testViewcategory"

)
public class TestRunner {

}
