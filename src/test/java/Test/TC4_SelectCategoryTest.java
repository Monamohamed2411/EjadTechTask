package Test;

import Pages.SelectCategoryPage;
import Test.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.SliderUI;

public class TC4_SelectCategoryTest extends TestBase {

    SelectCategoryPage SelectCategory;

    @Test
    public void SelectCategoryAndItem(){
        driver.get("https://egypt.souq.com/eg-en/");
        SelectCategory= new SelectCategoryPage(driver);
        SelectCategory.SelectCategory(driver);

        WebElement ProductTitle= driver.findElement(By.id("productTitle"));

        String Actual= ProductTitle.getText();

        String ExpectedAr="لعبة موبايل للأطفال من كافانا للأطفال بعمر سنة واحدة - لعبة موبايل للأطفال، ألعاب موسيقية للأطفال مع أضواء ثلاثية الأبعاد، لعبة موبايل، ألعاب موبايل، موبايل للأطفال، ألعاب موسيقية للأطفال خفيف";

        String ExpectedEn="KAVANA Kids Mobile Phone Toy for 1 Year Old Baby - Toy Phone for Kids,Musical Toys for Kids with 3D Lights,Mobile Toy,Phone Toys Mobile Phone for Kids Phone Toy Musical Toys for Kids Smart Light";

        if (Actual.matches(".*[\\u0600-\\u06FF].*")){
            Assert.assertTrue(Actual.contains(ExpectedAr), "The actual text is contain the expected data.");
            System.out.println("The title is in Arabic.");
        }
        else {
            Assert.assertTrue(Actual.contains(ExpectedEn), "The actual text is contain the expected data.");
            System.out.println("The title is in English.");

        }



    }



}
