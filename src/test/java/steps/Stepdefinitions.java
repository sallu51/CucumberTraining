package steps;

import com.sf.driver.Driver;
import com.sf.driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesnactions.Basetest;

public class Stepdefinitions extends Basetest {


    @Given("user is in statefarm home page")
    public void user_is_in_statefarm_home_page() {
        launchBrowser();
    }

    @When("user select <Product>")
    public void user_select_product() {

    }

    @When("user enters <zipcode>")
    public void user_enters_zipcode() {

    }

    @When("user clicks on start a quote")
    public void user_clicks_on_start_a_quote() {

    }

    @Then("<Title> should be displayed")
    public void title_should_be_displayed() {
        Driver.quitDriver();
    }
}
