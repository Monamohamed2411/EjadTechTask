package Test;

import Pages.LoginPage;
import Pages.NavigateToSignUpPage;
import org.testng.annotations.Test;

public class TC2_LoginTest extends TestBase{

    LoginPage LoginData;
    NavigateToSignUpPage SignIn;

@Test(priority = 1)
    public void NavigateToSignUp(){

        SignIn = new NavigateToSignUpPage(driver);
        SignIn.UserSignIn(driver);

    }

    @Test(priority = 2)
    public void USerLogin(){
        LoginData = new LoginPage(driver);
        LoginData.UserLogin("01127259058", "123456");

    }
}
