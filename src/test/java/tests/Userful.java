package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Userful {
    @Test
    public void test01(){

//QualityDemiy adresine git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookie.click();

//QualityDemiy adresine gittiğini doğrula
        String expectedUrlKelime="qualitydemy";
        String actualUrlKelime=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlKelime.contains(expectedUrlKelime));

//Userful link için sayfayi en alta kaydır
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);


//"Userful link" basligi dogrula

        Assert.assertTrue(qualitydemyPage.usefulLinksBaslik.isDisplayed());
        ReusableMethods.bekle(2);
        //Blog linkine tikla
        qualitydemyPage.blogLinki.click();

        // "Latest Blogs" basligini dogrula geri dön
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(qualitydemyPage.latestBlogs.isDisplayed());

        Driver.getDriver().navigate().back();

        //All courses linkine tikla

        qualitydemyPage.allCourseLinki.click();

        //"All courses" basligini dogrula geri dön

        Assert.assertTrue(qualitydemyPage.allCourseBaslik.isDisplayed());
        Driver.getDriver().navigate().back();

        //Sign Up linkine tikla
        qualitydemyPage.signUpLinki.click();

        //"Sign up and start learning" basligini dogrula

        Assert.assertTrue(qualitydemyPage.signupandstartLearningBaslik.isDisplayed());

        ReusableMethods.bekle(2);

        Driver.closeDriver();


    }


}

