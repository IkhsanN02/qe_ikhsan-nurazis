package starter.SelectProduct;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectProductPage extends PageObject {

    private By buttonOther(){
        return By.id("Lainnya");
    }
    private By ButtonPascabayar(){
        return By.id("Pascabayar");
    }
    @Step
    public void clickButtonOther() {
        $(buttonOther()).click();
    }

    @Step
    public void clickButtonPascabayar() {
        $(ButtonPascabayar()).click();
    }
}
