package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.configReader;

import javax.swing.*;
import java.lang.module.Configuration;

public class EnglishGrammer {

    @Test
    public void test01() {

        Driver.getDriver().get(configReader.getProperty("qdUrl"));

        String actData = Driver.getDriver().getTitle();
        String expData = "QualityDemy";

        Assert.assertTrue(actData.contains(expData));


        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualitydemyPage.categories)
                .moveToElement(qualitydemyPage.englishCourse)
                .moveToElement(qualitydemyPage.englishGrammerLink).click().perform();

        actData = qualitydemyPage.englishGrammerHeader.getText();
        expData = "English Grammar";

        Assert.assertTrue(actData.contains(expData));

        int expShowing = 1;
        String[] result = qualitydemyPage.searchResult.getText().split(" ");

        int actShowing = Integer.parseInt(result[3]);

        Assert.assertEquals(expShowing,actShowing);

        actions.moveToElement(qualitydemyPage.firstCourseLink).click().perform();

        actData = qualitydemyPage.courseHeader.getText();
        expData = "English Grammar";

        Assert.assertTrue(actData.contains(expData));

        Driver.getDriver().navigate().back();

        actions.moveToElement(qualitydemyPage.intermediateRadioButton).click().perform();

    }
}
