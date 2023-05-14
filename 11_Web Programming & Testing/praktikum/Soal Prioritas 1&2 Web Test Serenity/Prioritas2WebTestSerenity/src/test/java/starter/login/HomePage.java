package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By productsTitle(){
        return By.xpath("//h2");
    }

    @Step
    public void validateOnTheHomePage(){
        $(productsTitle()).isDisplayed();
    }
}
