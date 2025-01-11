package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

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


    public void SignUp(String UserName,String UserPhone,String UserPassword , WebDriver driver) throws InterruptedException {

        try {
            WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(3));
            exp.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email_login")));
            WebElement email= driver.findElement(By.id("ap_email_login"));
            setTextElement(email,UserPhone);
            WebElement butt= driver.findElement(By.cssSelector("[class=\"a-button-input\"]"));
            butt.click();
            while(UserPhone.length()!=10 ){
                Random random = new Random();
                int IDFormat = random.nextInt(99999) + 10000;
                String PhoneNumber = "11"+ IDFormat + "758";
                Thread.sleep(2000);
                email.clear();
                setTextElement(email,PhoneNumber);
                if (PhoneNumber.length()==10){
                    butt.click();
                    break;
                }
            }

            exp.until(ExpectedConditions.presenceOfElementLocated(By.id("intention-submit-button")));
            WebElement but2= driver.findElement(By.id("intention-submit-button"));
            but2.click();
            setTextElement(Name, UserName);
            setTextElement(Password, UserPassword);
            setTextElement(ConfirmPassword, UserPassword);
            clickButton(CheckPhone);

        } catch (TimeoutException e) {
            System.out.println("Image Element does not exist");
            setTextElement(Name, UserName);
            setTextElement(Phone,UserPhone);
            setTextElement(Password, UserPassword);
            setTextElement(ConfirmPassword, UserPassword);
            clickButton(CheckPhone);

//            while(UserPhone.length()!=10 ){
//                Random random = new Random();
//                int IDFormat = random.nextInt(9999) + 1000;;
//                String PhoneNumber = "11"+ IDFormat + "758";
//                Thread.sleep(2000);
//                Phone.clear();
//                setTextElement(Phone,PhoneNumber);
//                if (PhoneNumber.length()==10){
//                    break;
//                }
//            }

        }


    }

    public void DiffSignUp(String UserName,String UserPhone,String UserPassword , String ConfPass ){
        setTextElement(Name, UserName);
        setTextElement(Phone,UserPhone);
        setTextElement(Password, UserPassword);
        setTextElement(ConfirmPassword, ConfPass);
        clickButton(CheckPhone);
    }

    public void ClearData(){
        Name.clear();
        Phone.clear();
        Password.clear();
        ConfirmPassword.clear();

    }
}
