package Test;

import Pages.NavigateToSignUpPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class TC1_SignUpTest extends TestBase{

NavigateToSignUpPage SignUp;
SignUpPage SignUpDate;

@Test(priority = 1)
public void NavigateToSignUp(){

    SignUp= new NavigateToSignUpPage(driver);
    SignUp.UserSignUP(driver);

}
@Test(priority = 2)
    public void SignUpForm(){
    SignUpDate= new SignUpPage(driver);
    SignUpDate.SignUp("Mona","1127259058","123456");
}
}
