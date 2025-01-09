package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgePasswordPage extends LoginPage{
    public ForgePasswordPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "auth-fpp-link-bottom")
    WebElement ForgetButton;
public void UserForgetPass(String UserEmail){
        setTextElement(Email, UserEmail);
        clickButton(ContinueButton);
        clickButton(ForgetButton);
        clickButton(ContinueButton);

}

}
