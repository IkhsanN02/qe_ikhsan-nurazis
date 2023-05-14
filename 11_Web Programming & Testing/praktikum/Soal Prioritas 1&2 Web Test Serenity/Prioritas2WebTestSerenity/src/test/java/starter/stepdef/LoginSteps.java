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
    public void onTheLoginPage(){
        loginPage.openUrl("https://www.sepulsa.com/signin");
        loginPage.validateOnTheLoginPage();
    }
    @When("I input valid email")
    public void doEnterValidEmail(){
        loginPage.inputUsername("masgilangggg@gmail.com");
    }
    @And("I input valid password")
    public void doEnterValidPassword(){
        loginPage.inputPassword("Gilang68!");
    }
    @And("I click login button")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("I go to homepage")
    public void goToHomePage(){
        homePage.validateOnTheHomePage();
    }
    @When("I input invalid email and password")
    public void inputInvalidEmail(){
        loginPage.inputUsername("akugantengbanget@gmail.com");
        loginPage.inputPassword("ahahahah1234");
    }
    @Then("I will get error message")
    public void getErrorMessage(){
        homePage.validateOnTheHomePage();
    }
}
