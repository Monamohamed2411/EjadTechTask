package Test;

import Pages.Data;
import Pages.NavigateToSignUpPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class TC1_SignUpTest extends TestBase{


SignUpPage SignUpDate;

@Test
    public void SignUpForm() throws InterruptedException {
    SignUpDate= new SignUpPage(driver);
    SignUpDate.SignUp(Data.Name,Data.phoneNumber,Data.Password,driver);
}
}
