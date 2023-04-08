package starter.paymentMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PaymentMethodSteps {
    @Given("I am on the menu all product")
    public void onTheMenuAllProcuct() { System.out.println("I am on the menu all product");
    }
    @When("I choose \"Pulsa\" product")
    public void chooseProduct(){ System.out.println("I choose \"Pulsa\" product");
    }
    @And("I enter mobile phone number correctly")
    public void phoneNumberCorrectly(){ System.out.println("I enter mobile phone number correctly");
    }
    @Then("I can select a payment method")
    public void selectPaymentMethod(){
        System.out.println("I can select a payment method");
    }

    @And("I enter mobile phone number incorrectly")
    public void phoneNumberIncorrectly(){ System.out.println("I enter mobile phone number incorrectly");
    }

    @Then("I got an error message")
    public void errorMassage(){ System.out.println("I got an error message"); }
}
