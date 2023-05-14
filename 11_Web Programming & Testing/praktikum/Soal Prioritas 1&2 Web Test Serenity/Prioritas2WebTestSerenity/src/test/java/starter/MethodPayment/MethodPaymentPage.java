package starter.MethodPayment;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class MethodPaymentPage extends PageObject {
    private By iconPulsa(){
        return By.id("Pulsa");
    }
    private By iconNominal(){
        return By.className("nominal-item__price");
    }
    private By iconPayment(){
        return By.id("checkbox Gopay");
    }
    private By phoneNumberField(){
        return By.id("phone_number");
    }


    @Step
    public void clickIconProduct(){
        $(iconPulsa()).click();
    }

    @Step
    public void inputPhoneNumber(String phonenumber){
        $(phoneNumberField()).type(phonenumber);
    }

    @Step
    public void clickNominal(){
        $(iconNominal()).click();
    }

    @Step
    public void clickPayment(){
        $(iconPayment()).click();
    }

    public void validateOnClicked() {
        $(iconPayment()).isSelected();
    }
}
