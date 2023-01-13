package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class test34 {
    WebDriver driver;
    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterAll
    public void down(){
        //driver.close();
    }


    @Test
    @Order(1)
    public void homep() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        WebElement home2 = driver.findElement(By.xpath("//h2[text()='Category']"));
        Assertions.assertTrue(home2.isDisplayed());
        //WebElement click = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        //click.click();
    }
    @Test
    @Order(2)
    public void control() throws InterruptedException {
        WebElement produckadd=driver.findElement(By.xpath("(//a[text()='Add to cart'])[3]"));
        produckadd.click();
        Thread.sleep(5000);
        WebElement produckdisp= driver.findElement(By.xpath("//u[text()='View Cart']"));
        produckdisp.click();
        WebElement checkout=driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
        checkout.click();
        WebElement register= driver.findElement(By.xpath("//u[text()='Register / Login']"));
        register.click();
    }
}
