package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "ap_email")
    WebElement Email;
    @FindBy(id = "continue")
    WebElement ContinueButton;

    @FindBy(id = "ap_password")
    WebElement Password;

    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    public void UserLogin(String UserEmail, String UserPassword){

        setTextElement(Email, UserEmail);
        clickButton(ContinueButton);
        setTextElement(Password, UserPassword);
        clickButton(signInButton);

    }



}
