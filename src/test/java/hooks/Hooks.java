package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    public static RequestSpecification spec;

    @Before
    public void setUp() {

   //seni cok seviyorum
        spec = new RequestSpecBuilder().setBaseUri("https://amazon.com").build();

    }


    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}
