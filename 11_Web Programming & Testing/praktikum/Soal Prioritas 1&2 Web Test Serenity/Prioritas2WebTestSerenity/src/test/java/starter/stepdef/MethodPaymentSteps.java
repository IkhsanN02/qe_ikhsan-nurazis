package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import starter.MethodPayment.MethodPaymentPage;

public class MethodPaymentSteps extends PageObject {
    @Steps
    MethodPaymentPage paymentMethodPage;
    @Given("I am on the menu all product")
    public void onMenuAllProduct(){
        paymentMethodPage.openUrl("https://www.sepulsa.com/menu");
    }
    @When("I choose pulsa product")
    public void chooseProduct(){
        paymentMethodPage.clickIconProduct();
    }
    @And("I enter mobile phone number correctly")
    public void phoneNumberCorrectly(){
        paymentMethodPage.inputPhoneNumber("081286501752");
    }
    @And("I choose nominal")
    public void chooseNominal(){
        paymentMethodPage.clickNominal();
    }
    @And("I choose payment method")
    public void choosePayment(){
        paymentMethodPage.clickPayment();
    }
    @Then("I can select a payment method")
    public void selectPaymentMethod(){
        paymentMethodPage.validateOnClicked();
    }

}
