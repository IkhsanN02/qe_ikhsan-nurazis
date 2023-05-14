package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.SelectProduct.MenuPage;
import starter.SelectProduct.SelectProductPage;
import starter.SelectProduct.MenuPage;
import starter.SelectProduct.SelectProductPage;

public class SelectProductSteps {
    @Steps
    SelectProductPage selectProductPage;

    @Steps
    MenuPage menuPage;

    @Given("I am on the home page")
    public void onTheHomePage(){
        selectProductPage.openUrl("https://www.sepulsa.com/");
    }

    @When("I click other")
    public void clickOther(){
        selectProductPage.clickButtonOther();
    }

    @And("I click Pascabayar product")
    public void pascabayarProduct(){
        selectProductPage.clickButtonPascabayar();
    }

    @Then("I can select the product")
    public void selectTheProduct(){
        menuPage.validateMenu();
    }
}
