package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class NavigateToSignUpPage extends PageBase{
    public NavigateToSignUpPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(id = "nav-link-accountList")
    WebElement SignUpHover;

    @FindBy(css = "[class=\"nav-a\"]")
    List<WebElement> SignUpButton;

    @FindBy (css = "[class=\"nav-action-signin-button\"]")
    List<WebElement> SignInButton;


    public void UserSignUP(WebDriver driver){
        Actions actions = new Actions(driver);

        actions.moveToElement(SignUpHover).perform();
        try {
            WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(3));
            exp.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"nav-a\"]")));
            clickButton(SignUpButton.get(0));
        } catch (TimeoutException e) {
            System.out.println("Image Element does not exist");
        }
    }



    public void UserSignIn(WebDriver driver){
        Actions actions = new Actions(driver);

        actions.moveToElement(SignUpHover).perform();
        try {
            WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(3));
            exp.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"nav-action-signin-button\"]")));
            clickButton(SignInButton.get(0));
        } catch (TimeoutException e) {
            System.out.println("Image Element does not exist");
        }
    }

    }

