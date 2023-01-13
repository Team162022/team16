package tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reuseable;
import utilities.configReader;
import java.util.List;
import java.util.stream.Collectors;

public class webDesingCourse {
    @BeforeTest
    public void BeforeTest(){Driver.beforeTest();}
    @AfterTest
    public void afterTest(){
        Driver.afterTest();
    }
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Test(priority = 1)
    public void webDesingCourse(){
        Driver.getDriver().get(configReader.getProperty("qdUrl"));
        //cookie onaylaa
        qualitydemyPage.cookies.click();
        //Actions methodu ile elementin üzerine gi
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.categories).perform();
        actions.moveToElement(qualitydemyPage.webDesignCourse).perform();
        actions.moveToElement(qualitydemyPage.webDesignForWebDev).click().perform();
        //Web Design Kategorisine gittigini dogrula
        qualitydemyPage.webDesignForWebDevDisplayed.isDisplayed();
    }
    @Test(priority = 2)
    public void html5AndCss(){
        Reuseable.keysPageDown();
        //Html5 kategorisine geçiş yap
        qualitydemyPage.html5AndCss.click();
        //Html kategorisine gittiğini doğrula
        qualitydemyPage.html5AndCssDisplayed.isDisplayed();
        //ilk sirada ki linke tikla
        qualitydemyPage.listClick.click();
        //Html içeriyor mu dogrula
        Driver.getDriver().getTitle().contains("HTML");
        Driver.getDriver().navigate().back();


    }
    @Test(priority = 3)
    public void beginnerTest() {


        Reuseable.keysPageDown();
        Reuseable.keysPageDown();
        Reuseable.bekle(5);
        //Beginner Tikla
        qualitydemyPage.beginnerClick.click();
        //Beginner iceriyor mu test et
        List<String> list=qualitydemyPage.beginnerList.stream().map(WebElement::getText).collect(Collectors.toList());
        list.forEach(n-> Assert.assertTrue(n.contains("Beginner")));
        //Advanced Tikla
        Reuseable.keysPageDown();
        Reuseable.keysPageDown();
        Reuseable.bekle(5);
        qualitydemyPage.advancedClick.click();
        //Advanced iceriyor mu test ett
        List<String> list2=qualitydemyPage.advancedList.stream().map(WebElement::getText).collect(Collectors.toList());
        list2.forEach(n-> Assert.assertTrue(n.contains("Advanced")));
        //Inremediate Tikla
        Reuseable.keysPageDown();
        Reuseable.keysPageDown();
        Reuseable.bekle(5);
        qualitydemyPage.intermediateClick.click();
        //Intermediate iceriyor mu test ett
        List<String> list3=qualitydemyPage.intermediateList.stream().map(WebElement::getText).collect(Collectors.toList());
        list3.forEach(n-> Assert.assertTrue(n.contains("Intermediate")));
    }
}
