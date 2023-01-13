package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Reuseable;

import java.util.List;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Home Page

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookies;

    public  void handleCookies(){
        if(cookies.isDisplayed()) {
            cookies.click();
            Reuseable.bekle(2);
        }
    }

    @FindBy(xpath = "//li[@class='has-children text-nowrap fw-bold']")
    public WebElement categories;

    @FindBy(xpath = "//span[text()='English Course']")
    public WebElement englishCourse;

    @FindBy(xpath = "//span[text()='Web Design Course']")
    public WebElement webDesignCourse;
    @FindBy(xpath = "(//a[@class='text-wrap'])[1]")
    public WebElement webDesignForWebDev;

    //Categories
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement webDesignForWebDevDisplayed;
    @FindBy(xpath = "//div[@class='course-box-2']")
    public List<WebElement> html5AndCssTitle;
    @FindBy(xpath = "//label[text()='HTML5 and CSS']")
    public WebElement html5AndCss;
    @FindBy(xpath = "//h5[text()='Categories']")
    public WebElement pageDown;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement html5AndCssDisplayed;
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement listClick;
    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement listClick2;
    @FindBy(xpath = "(//a[@class='course-title'])[3]")
    public WebElement listClick3;
    @FindBy(xpath = "(//a[@class='course-title'])[4]")
    public WebElement listClick4;

    //Intermediate Buton Ve List Testi
    @FindBy(xpath = "//label[text()='Intermediate']")
    public WebElement intermediateClick;
    @FindBy(xpath = "//span[text()='Intermediate']")
    public List<WebElement> intermediateList;

    //Advanced Buton Ve List Testii
    @FindBy(xpath = "//label[text()='Advanced']")
    public WebElement advancedClick;
    @FindBy(xpath = "//span[text()='Advanced']")
    public List<WebElement> advancedList;

    //Beginner Buton Ve List Testii
    @FindBy(xpath = "//label[text()='Beginner']")
    public WebElement beginnerClick;
    @FindBy(xpath = "//span[text()='Beginner']")
    public List<WebElement> beginnerList;


    @FindBy(xpath = "//a[text()='English Speaking Course']")
    public WebElement englishSpeaking;

    //English course
    @FindBy(xpath = "//div[@class='course-box-2']")
    public List<WebElement> listOfEnglishCourse;

    @FindBy(xpath = "//*[text()='Free']")
    public WebElement freeRadioBtn;

    @FindBy(xpath = "//*[@class='category-course-list']")
    public WebElement noResult;

    @FindBy(xpath = "//label[text()='Beginner']")
    public WebElement beginnerCheckBox;
    @FindBy(xpath = "//span[text()='Beginner']")
    public List<WebElement> beginnerCourseList;
    ////Home Click Element
    @FindBy(xpath = "//*[text()='Search ']")
    public WebElement homeDisplayed;
    @FindBy(xpath = "(//div[@class='category-title'])[1]")
    public WebElement getWebDesignForWebDevClick;
    @FindBy(xpath = "(//div[@class='category-title'])[2]")
    public WebElement getEnglishCourseClick;
    @FindBy(xpath = "(//div[@class='category-title'])[3]")
    public WebElement getHtml5AndCssClick;
    @FindBy(xpath = "(//div[@class='category-title'])[4]")
    public WebElement awsCertificationClick;
    @FindBy(xpath = "(//div[@class='category-title'])[5]")
    public WebElement compTiaSecurityClick;
    @FindBy(xpath = "(//div[@class='category-title'])[6]")
    public WebElement pianoClick;
    @FindBy(xpath = "(//div[@class='category-title'])[7]")
    public WebElement disneyMagicEnglishClick;
    @FindBy(xpath = "(//div[@class='category-title'])8]")
    public WebElement englishGrammarClick;
    @FindBy(xpath = "(//div[@class='category-title'])9]")
    public WebElement microsoftCertificationClick;
    //Home Displayed
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement awsCertificationDisplayed;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement compTiaSecurityDisplayed;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement pianoDisplayed;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement disneyMagicEnglishDisplayed;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement englishGrammarDisplayed;
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement microsoftCertificationDisplayed;


}
