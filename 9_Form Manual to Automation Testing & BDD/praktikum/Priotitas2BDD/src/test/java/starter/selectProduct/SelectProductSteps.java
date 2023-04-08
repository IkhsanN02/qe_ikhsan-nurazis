package starter.selectProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectProductSteps {
    @Given("I am on the home page")
    public void onTheHomePage() {
        System.out.println("I am on the home page");
    }
    @When("I click \"Others\"")
    public void clictOthers(){
        System.out.println("I click \"Others\"");
    }
    @And("I go to menu all product")
    public void allProduct(){
        System.out.println("I go to menu all product");
    }
    @Then("I can select the product")
    public void slsectTheProduct(){
        System.out.println("I can select the product");
    }
}
