package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reuseable;
import utilities.configReader;

import java.util.List;
import java.util.stream.Collectors;

public class EnglishCourse {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Test()
    public void test01(){
         qualitydemyPage=new QualitydemyPage();

        Driver.getDriver().get(configReader.getProperty("qdUrl"));
        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(qualitydemyPage.categories).perform();
        actions.moveToElement(qualitydemyPage.englishCourse).perform();
        qualitydemyPage.englishSpeaking.click();
        //kejkwd

        List<WebElement> elements=qualitydemyPage.listOfEnglishCourse;

        List<String> stringList= Reuseable.getElementsText(elements);

        stringList.forEach(each-> Assert.assertTrue(each.contains("speak")));

    }
    @Test()
    public void test02(){
        //free english course olmadıgını dogrulayan test
        qualitydemyPage=new QualitydemyPage();
        Reuseable.scrollDown();
        Reuseable.bekle(3);//scroll asagı indirilince element tıklanabilir yani görünür olabilmesi için bekletilir
        qualitydemyPage.freeRadioBtn.click();
        Assert.assertTrue(qualitydemyPage.noResult.isDisplayed());
    }

    @Test()
    public void test03(){
        qualitydemyPage=new QualitydemyPage();
        Reuseable.scrollDown();
        Reuseable.bekle(3);
        qualitydemyPage.beginnerCheckBox.click();
        List<String> listOfCourse=qualitydemyPage.beginnerCourseList.stream().map(WebElement::getText).toList();
        listOfCourse.forEach(n->Assert.assertTrue(n.contains("Beginner")));
        Driver.quitDriver();
    }
}


// Runnur'i 3 yaparsak 3 yazmamiz lazim
//
//
//
// <include>**/runners/*ParelelRunner*.java</include>
//kismini degistire biliriz ParelelRunner
//
//mvn clean verify
//
//
//
////div[text()='Reject all'])[2]
//
////select[@data-test='LanguageSelect']
//
////*[text()='TRY']
//
//WebElement test=driver.findElement(By.xpath("//*[text()='TRY']"));
//Assert.assertTrue(test.getText().contains("TRY"));
//// burada yaptigimiz test.getText()=TRY'i iceriyorsa biz amacimiza ulasmis oluruz
//
//String expectedKelime="Çok Satanlar";
//String actualtitle=driver.getTitle();
//Assert.assertTrue(actualtitle.contains(expectedKelime));