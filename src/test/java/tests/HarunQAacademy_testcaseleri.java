package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reuseable;
import utilities.configReader;

import java.util.List;
import java.util.Set;

public class HarunQAacademy_testcaseleri {

    /*
    QualityDemiy adresine git
QualityDemiy adresine gittiğini doğrula
Categories üzerine git
It & Software üzerine git
AWS Certification tikla
AWS Certification basligini dogrula
Price bölümünde Free butonuna tikla liste de Free olup olmadıgını List ile test et
Paid butonuna tikla liste de Paid olup olmadigini List ile test et
     */



    @Test
    public void Testcase1(){
//  QualityDemiy adresine git
//QualityDemiy adresine gittiğini doğrula
        Driver.getDriver().get(configReader.getProperty("qdUrl"));
        String actualurl   = Driver.getDriver().getCurrentUrl();
        String expextedurl = "https://www.qualitydemy.com/";
        Assert.assertEquals(actualurl,expextedurl);

        //Categories üzerine git
        //It & Software üzerine git
        //AWS Certification tikla
        //AWS Certification basligini dogrula

        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(qualitydemyPage.QACategoriesButonu).perform();
        actions.moveToElement(qualitydemyPage.QAItSoftware).perform();

        String ilksayfahndldegeri = Driver.getDriver().getWindowHandle();


        actions.doubleClick(qualitydemyPage.QAAWSCertification).perform();

        Reuseable.bekle(3);



        Set<String> windowhndldegeri = Driver.getDriver().getWindowHandles();

        String ikincisayfahndldegeri = "";
        for (String each:windowhndldegeri
        ) {

            if (!each.equals(ilksayfahndldegeri)){
                ikincisayfahndldegeri=each;
            }
        }

        String actualtitle = Driver.getDriver().switchTo().window(ikincisayfahndldegeri).getTitle();
        String expectedtitle = "AWS Certification";

        //Assert.assertTrue(actualtitle.contains(expectedtitle));



        qualitydemyPage.QAFreebutonu.click();

        List<WebElement> freelistesi = Driver.getDriver().findElements(By.xpath("course-box-2"));

        for (int i = 0; i < freelistesi.size(); i++) {

            Assert.assertTrue(freelistesi.get(i).getText().contains("free"));

        }


        qualitydemyPage.paidButonu.click();


        List<WebElement>paidlistesi = Driver.getDriver().findElements(By.xpath("course-box-2"));

        for (int i = 0; i < paidlistesi.size(); i++) {

            Assert.assertTrue(paidlistesi.get(i).getText().contains("paid"));

        }

        Driver.quitDriver();

    }
}
