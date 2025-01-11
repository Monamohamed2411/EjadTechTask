package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectCategoryPage extends PageBase{
    public SelectCategoryPage(WebDriver drive) {
        super(drive);
    }

    @FindBy(css = "a[href=\"/%D8%AF%D9%85%D9%89-%D9%88%D8%A3%D9%84%D8%B9%D8%A7%D8%A8/b/?ie=UTF8&node=18022503031&ref_=nav_cs_toys\"]")
    WebElement SelectCategory;


//    @FindBy(css = "a[href*=\"https://www.amazon.eg/-/en/KAVANA-Kids-Mobile-Phone-Year/dp/B0C6FBQ9MC/ref=s9_acsd_al_ot_c2_x_1_t?_encoding=UTF8&pf_rd_m=ARBP9OOSHTCHU&pf_rd_s=merchandised-search-4\"]")

    @FindBy(css = "[class*=\"a-spacing-top-micro _carousel_style_product-image__3GTWS\"]")
      List<WebElement>   Item;


    public void SelectCategory(WebDriver driver){
        clickButton(SelectCategory);


        try {
            WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(3));
            exp.until(ExpectedConditions.presenceOfElementLocated
                    (By.cssSelector("[class*=\"a-spacing-top-micro _carousel_style_product-image__3GTWS\"]")));
            clickButton(Item.get(1));
        } catch (TimeoutException e) {
            System.out.println("Image Element does not exist");
        }

    }
}
