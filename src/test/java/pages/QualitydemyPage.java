package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Useful links']")
    public WebElement usefulLinksBaslik;

    @FindBy(linkText = "Blog")
    public WebElement blogLinki;

    @FindBy(xpath = "//h4[text()='Latest Blogs']")
    public WebElement latestBlogs;

    @FindBy(linkText = "All courses")
    public WebElement allCourseLinki;

    @FindBy(xpath = "/html/body/section[2]/div[2]/nav/ol/li[1]/a")
    public WebElement allCourseBaslik;

    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[3]/a")
    public WebElement signUpLinki;

    @FindBy(xpath = "//p[text()='Sign up and start learning']")
    public WebElement signupandstartLearningBaslik;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookie;





}
