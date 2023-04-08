package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchLinkedin {
    WebDriver driver;


    @Given("I open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();

    }
    @And("Open website Linkedin")
    public void openWebsiteLinkedin() throws InterruptedException {
        driver.get("https://www.Linkedin.com/");
        Thread.sleep(1000);
    }

    @When("I click people")
    public void iClickPeople() {
        driver.findElement(By.xpath("a[@href ='https://www.linkedin.com/pub/dir/+/+?trk=guest_homepage-basic_guest_nav_menu_people']"));
    }

    @And("I input first name {string}")
    public void iInputFirstName(String searchValue) {
        driver.findElement(By.name("firstName")).sendKeys(searchValue);
        driver.findElement(By.name("firstName")).sendKeys(Keys.ENTER);
    }

    @And("I input last name {string}")
    public void iInputLastName(String searchValue) {
        driver.findElement(By.name("lastName")).sendKeys(searchValue);
        driver.findElement(By.name("lastName")).sendKeys(Keys.ENTER);
    }

    @Then("Showing result related with the input")
    public void showingResultRelatedWithTheInput() {
        driver.close();
        driver.quit();
    }


}
