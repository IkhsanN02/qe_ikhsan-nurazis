package starter.SelectProduct;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {

    private By menuProduct(){
        return By.id("input_id_mobilepostpaid");
    }
    public void validateMenu() {
        $(menuProduct()).isDisplayed();
    }
}
