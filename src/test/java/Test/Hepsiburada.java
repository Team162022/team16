package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Hepsiburada {
    WebDriver driver;

    @BeforeAll
    public void setp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Initial settings have just been set up!!");
    }
    @AfterAll
    public void close() throws InterruptedException {
        Thread.sleep(8000);
        driver.close();
    }
    @Test
    public void control() throws InterruptedException {
        driver.get("https://www.hepsiburada.com");
        WebElement home3= driver.findElement(By.xpath("//button[text()='Kabul Et']"));
        home3.click();
        WebElement home= driver.findElement(By.xpath("//input[@class='theme-IYtZzqYPto8PhOx3ku3c']"));
        home.sendKeys("Telefon");
        WebElement home2= driver.findElement(By.xpath("//div[text()='ARA']"));
        home2.click();
        Thread.sleep(3000);
        WebElement produ= driver.findElement(By.xpath("(//h3[@data-test-id='product-card-name'])[1]"));
        Thread.sleep(3000);
        produ.click();
        driver.switchTo();
    }
}
