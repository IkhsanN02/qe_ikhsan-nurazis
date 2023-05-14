package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.HomePage;
import starter.login.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com/");
        loginPage.validateOnTheLoginPage();
    }

    @When("I enter valid username")
    public void iEnterValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickButtonLogin();
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.validateOnTheHomePage();
    }

    @When("I enter invalid username")
    public void iEnterInvalidUsername() {
        loginPage.inputUsername("test_alta");
    }

    @When("I enter \"problem_user\" username")
    public void iEnterUsername() {
        loginPage.inputUsername("problem_user");
    }

    @Then("I can see error message {string}")
    public void iCanSeeErrorMessage(String message) {
        loginPage.validateErrorMessageDisplayed();
        loginPage.validateEqualErrorMessage(message);
    }
}
