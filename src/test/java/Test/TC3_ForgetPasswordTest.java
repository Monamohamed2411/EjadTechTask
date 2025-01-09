package Test;

import Pages.ForgePasswordPage;
import Pages.LoginPage;
import Pages.NavigateToSignUpPage;
import org.testng.annotations.Test;

public class TC3_ForgetPasswordTest extends TestBase{


    ForgePasswordPage LoginData;
    NavigateToSignUpPage SignIn;

    @Test(priority = 1)
    public void NavigateToSignUp(){

        SignIn = new NavigateToSignUpPage(driver);
        SignIn.UserSignIn(driver);

    }
@Test(priority = 2)
    public void ForgetDate(){
        LoginData= new ForgePasswordPage(driver);
        LoginData.UserForgetPass("01127259058");

    }
}
