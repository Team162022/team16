package pages;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.Reuseable;

public class QualityDemyHome {
    /*
    QualityDemiy adresine git
QualityDemiy adresine gittiğini doğrula
Top Categories bölümüne git
Web Design for Web Developers tikla basligi doğrula QualityDemiy ana sayfaya geri dön
English Speaking Course tikla basligi doğrula QualityDemiy ana sayfaya geri dön
HTML5 and CSS tikla basligi doğrula QualityDemiy ana sayfaya geri dön
AWS Certification tikla basligi doğrula QualityDemiy ana sayfaya geri dön
Piano tikla basligi doğrula QualityDemiy ana sayfaya geri dön
Disney Magic English tikla basligi doğrula QualityDemiy ana sayfaya geri dön
English Grammer tikla basligi doğrula QualityDemiy ana sayfaya geri dön
Microsoft Certification tikla basligi doğrula QualityDemiy ana sayfaya geri dön
CompTIA Security tikla basligi doğrula QualityDemiy ana sayfaya geri dön
     */
    @AfterTest
    public void afterTest(){Driver.afterTest();}
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Test
    public void qualityHome(){
        //QualityDemiy adresine git
        Driver.getDriver().get("https://qualitydemy.com/");
        //QualityDemiy adresine gittiğini doğrula
        qualitydemyPage.homeDisplayed.isDisplayed();
        //Accept Onayla
        qualitydemyPage.cookies.click();
        Reuseable.keysPageDown();
        Reuseable.keysPageDown();
    }
    @Test
    public void qualityTopCategories(){
        //Top Categories bölümüne git

        //Web Design for Web Developers tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        Reuseable.bekle(3);
        qualitydemyPage.getWebDesignForWebDevClick.click();
        qualitydemyPage.webDesignForWebDevDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //English Speaking Course tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        Reuseable.bekle(4);
        qualitydemyPage.getEnglishCourseClick.click();
        qualitydemyPage.englishSpeaking.isDisplayed();
        Driver.getDriver().navigate().back();
        //HTML5 and CSS tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        Reuseable.bekle(4);
        qualitydemyPage.getHtml5AndCssClick.click();
        qualitydemyPage.html5AndCssDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //AWS Certification tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        Reuseable.bekle(4);
        qualitydemyPage.awsCertificationClick.click();
        qualitydemyPage.awsCertificationDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //CompTIA Security tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        qualitydemyPage.compTiaSecurityClick.click();
        qualitydemyPage.compTiaSecurityDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //Piano tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        qualitydemyPage.pianoClick.click();
        qualitydemyPage.pianoDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //Disney Magic English tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        qualitydemyPage.disneyMagicEnglishClick.click();
        qualitydemyPage.disneyMagicEnglishDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //English Grammar tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        qualitydemyPage.englishGrammarClick.click();
        qualitydemyPage.englishGrammarDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();
        //Microsoft Certification tikla basligi doğrula QualityDemiy ana sayfaya geri dön
        qualitydemyPage.microsoftCertificationClick.click();
        qualitydemyPage.microsoftCertificationDisplayed.isDisplayed();
        Driver.getDriver().navigate().back();



    }
}
