package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "ap_customer_name")
    WebElement Name;

    @FindBy(id = "ap_phone_number")
    WebElement Phone;

    @FindBy(id = "ap_password")
    WebElement Password;

    @FindBy(id = "ap_password_check")
    WebElement ConfirmPassword;

    @FindBy(id = "continue")
    WebElement CheckPhone;


    public void SignUp(String UserName,String UserPhone,String UserPassword ){
        setTextElement(Name, UserName);
        setTextElement(Phone,UserPhone);
        setTextElement(Password, UserPassword);
        setTextElement(ConfirmPassword, UserPassword);
        clickButton(CheckPhone);
    }
}
