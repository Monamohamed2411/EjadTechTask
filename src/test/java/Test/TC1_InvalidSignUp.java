package Test;

import Pages.Data;
import Pages.NavigateToSignUpPage;
import Pages.PageBase;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_InvalidSignUp extends TestBase {
    NavigateToSignUpPage SignUp;
    SignUpPage SignUpDate;

    @Test(priority = 1)
    public void NavigateToSignUp() throws InterruptedException {

        SignUp= new NavigateToSignUpPage(driver);
        SignUp.UserSignUP(driver);

    }

    @Test(priority = 2)
    public void EmptyName() throws InterruptedException {
    SignUpDate= new SignUpPage(driver);
    SignUpDate.SignUp("", Data.phoneNumber,Data.Password,driver);
        WebElement name= driver.findElement(By.id("ap_customer_name_context_message_section"));
        Assert.assertTrue(name.isDisplayed(),"The element is not displayed on the page.\"");
    }

    @Test(priority = 3)
    public void EmptyPhone() throws InterruptedException {
        SignUpDate= new SignUpPage(driver);
        SignUpDate.ClearData();
        Thread.sleep(2000);
        SignUpDate.SignUp(Data.Name,"",Data.Password,driver);
        WebElement name= driver.findElement(By.id("auth-phoneNumber-missing-alert"));
        Assert.assertTrue(name.isDisplayed(),"The element is not displayed on the page.\"");
    }

    @Test(priority = 4)
    public void MissMatchPassword() throws InterruptedException {
        SignUpDate= new SignUpPage(driver);
        SignUpDate.ClearData();
        Thread.sleep(2000);
        SignUpDate.DiffSignUp(Data.Name,Data.phoneNumber,Data.Password, Data.ConfirmPassword);
        WebElement name= driver.findElement(By.id("auth-password-mismatch-alert"));
        Assert.assertTrue(name.isDisplayed(),"The element is not displayed on the page.\"");

        SignUpDate.ClearData();
    }
}
