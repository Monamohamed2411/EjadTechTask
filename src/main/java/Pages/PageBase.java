package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
//protected WebDriver driver ;


	public PageBase(WebDriver drive) {

		PageFactory.initElements(drive, this);


	}
	
	public static void clickButton(WebElement button) {

		button.click();    
	}
	
	public static void setTextElement(WebElement text, String value ) {

		text.sendKeys(value);
	}

}
 