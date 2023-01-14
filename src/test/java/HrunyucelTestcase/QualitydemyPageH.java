package HrunyucelTestcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class QualitydemyPageH {




    public QualitydemyPageH(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//span[@class='fw-500']")

    public WebElement QACategoriesButonu;


    @FindBy(xpath = "//span[text()='IT & Software']")

    public WebElement QAItSoftware;

    @FindBy(xpath = "  (//a[@class='text-wrap'])[1]")

    public WebElement QAAWSCertification;



    @FindBy(xpath = " //label[@for='price_free']")

    public WebElement QAFreebutonu;


    @FindBy(xpath = "//div[@class='course-box-2']")

    public WebElement QAFreebutonekranlistesi;


    @FindBy(xpath = " //nav[@aria-label='breadcrumb']")

    public WebElement Sayfaarialabeli;


    @FindBy(xpath = "  //h5[text()='Price']")

    public WebElement printbutonu;


    @FindBy(xpath = "//label[@for='price_paid']")

    public WebElement paidButonu;


    @FindBy(xpath = "//div[@class='course-box-2']")

    public WebElement QApaidekranlistesi;




}
