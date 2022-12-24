import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class test {
    WebDriver driver;

    @BeforeAll
    public void sutUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }
    @AfterAll
    public void tearDown(){
        //driver.close();
    }

    @Test
    @Order(1)
    public void AmazonGo() {
        WebElement amazon = driver.findElement(By.id("twotabsearchtextbox"));
        amazon.sendKeys("i̇phone 14 pro");
        WebElement amazonclick = driver.findElement(By.id("nav-search-submit-button"));
        amazonclick.click();
    }
    @Test
    @Order(2)
    public void amazonisdisplayed(){
        WebElement amazonxpat=driver.findElement(By.xpath("//span[text()='1-16 of over 100,000 results for']"));
        amazonxpat.isDisplayed();
    }
    @Test
    @Order(3)
    public void amazonaddtoproduct() {
        WebElement amazonadd = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        amazonadd.click();
        WebElement amazondisp=driver.findElement(By.xpath("//h1[text()=' About this item ']"));
        amazondisp.isDisplayed();


    }
    @Test
    @Order(4)
    public void amazonaddtocard(){
        WebElement amazonaddcard=driver.findElement(By.id("add-to-cart-button"));
        amazonaddcard.click();
        WebElement productdisp=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
        productdisp.isDisplayed();
    }
}
