package starter.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
    @Given("I am on the login page")
    public void onTheLoginPage() { System.out.println("I am on the login page");
    }
    @When("I input valid email and password")
    public void inputValidEmailAndPassword(){ System.out.println("email");System.out.println("password");
    }
    @And("click login button")
    public void clickLoginButton(){
        System.out.println("click login button");
    }
    @Then("I go to homepage")
    public void goToHomepage(){
        System.out.println("I go to homepage");
    }

    @When("I input invalid email and password")
    public void inputInvalidEmailAndPassword() {
        System.out.println("I input invalid email and password");
    }

    @Then("I will get error message")
    public void getErrorMessage(){
        System.out.println("error message");
    }
}
