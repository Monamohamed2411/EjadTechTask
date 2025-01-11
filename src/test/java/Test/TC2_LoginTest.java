package Test;

import Pages.LoginPage;
import Pages.NavigateToSignUpPage;
import org.testng.annotations.Test;

public class TC2_LoginTest extends TestBase{

    LoginPage LoginData;
    NavigateToSignUpPage SignIn;

@Test(priority = 1)
    public void NavigateToSignUp() throws InterruptedException {


    driver.get("https://egypt.souq.com/eg-en/");
    Thread.sleep(2000);
        SignIn = new NavigateToSignUpPage(driver);
        SignIn.UserSignIn(driver);

    }

    @Test(priority = 2)
    public void USerLogin() throws InterruptedException {
        Thread.sleep(2000);
        LoginData = new LoginPage(driver);
        LoginData.UserLogin("01127259058", "123456");

    }
}
