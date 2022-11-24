package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class Amazon {

    @Given("Gehen auf Amazon homepage ein")
    public void gehen_auf_amazon_homepage_ein() {
        Driver.getDriver().get("https://www.amazon.de/");
        throw new io.cucumber.java.PendingException();
    }
    @Given("suchen iPhone")
    public void suchen_i_phone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("beweisen dass die result iPhone enthalt")
    public void beweisen_dass_die_result_i_phone_enthalt() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
