package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DenemePage;
import utilities.Driver;

public class Deneme {
 DenemePage denemePage=new DenemePage();
 /* es ist wichtig ein obje zu erstellen nicht vergessen */
    @Given("Gehen auf Amazon homepage ein")
    public void gehen_auf_amazon_homepage_ein() {
        Driver.getDriver().get("https://www.amazon.de/");
        throw new io.cucumber.java.PendingException();
    }
    @Given("suchen iPhone")
    public void suchen_i_phone() {

        throw new io.cucumber.java.PendingException();
    }
    @Then("beweisen dass die result iPhone enthalt")
    public void beweisen_dass_die_result_i_phone_enthalt() {

        throw new io.cucumber.java.PendingException();
    }


}
