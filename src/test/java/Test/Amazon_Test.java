package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Amazon_Test {
    WebDriver driver;

    @BeforeAll
    public void setp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }
    @AfterAll
    public void close() {
        //driver.close();
    }

    @Test
    @Order(1)
    public void amazonsearch() {
        WebElement amazonsearch = driver.findElement(By.id("twotabsearchtextbox"));
        amazonsearch.sendKeys("i̇phone 14 pro");
        WebElement amazonclick = driver.findElement(By.id("nav-search-submit-button"));
        amazonclick.click();
        WebElement amazondisp = driver.findElement(By.xpath("//span[text()='1-16 of over 100,000 results for']"));
        amazondisp.isDisplayed();
    }
    @Test
    @Order(2)
    public void amazonproduct() {
        WebElement amazonadd = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        amazonadd.click();
        WebElement amazondisp2 = driver.findElement(By.id("add-to-cart-button"));
        amazondisp2.isDisplayed();
    }
    @Test
    @Order(3)
    public void amazonaddtocard() {
        WebElement amazonaddtocard = driver.findElement(By.id("add-to-cart-button"));
        amazonaddtocard.click();
        WebElement amazondisp3 = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
        amazondisp3.isDisplayed();
    }
    @Test
    @Order(4)
    public void amazongotocard() {
        WebElement amazongotocard= driver.findElement(By.xpath("(//span[@class='a-button-inner'])[6]"));
        amazongotocard.click();
        WebElement amazondisp4=driver.findElement(By.xpath("(//div[@class='a-row'])[9]"));
        amazondisp4.isDisplayed();
        WebElement amazonend=driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
        amazonend.click();
        WebElement amazondisp5=driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));
        amazondisp5.isDisplayed();
        System.out.println("This test will run on the fourth");
        System.out.println("The last update");
        System.out.println("The last");
        System.out.println("jwhfjwh");
        System.out.println("jwhfjwh");
        System.out.println("The very last");
        System.out.println("jhshakkjkj");
        System.out.println("sj<hjhdlkj");


    }


}
