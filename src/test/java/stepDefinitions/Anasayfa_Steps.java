package stepDefinitions;

import io.cucumber.java.en.Given;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import pages.Locates;
import utilities.ConfigReader;
import utilities.Driver;

public class Anasayfa_Steps {

    Locates locates=new Locates();

    @Given("Sezer Amazona gider")
    public void sezer_amazona_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Given("Arama kutusuna kalem yazar")
    public void arama_kutusuna_kalem_yazar() {
        locates.searchBx.sendKeys("bicycle"+ Keys.ENTER);

    }

    @Given("Arama btonuna tiklar")
    public void arama_btonuna_tiklar() {

    }



}
