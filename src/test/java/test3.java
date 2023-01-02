import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class test3 {
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
    public void control1(){
        driver.get("https://www.hepsiburada.com");
        WebElement coo=driver.findElement(By.id("onetrust-accept-btn-handler"));
        coo.click();
        WebElement searchbox= driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
        searchbox.sendKeys("Yulaf");
        searchbox.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
    }
    @Test
    @Order(2)
    public void control2(){
        WebElement searchbox2= driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
        searchbox2.sendKeys("Bcaa");


    }
    @Test
    @Order(3)
    public void control3(){
        WebElement search= driver.findElement(By.xpath("//div[text()='ARA']"));
        search.click();


    }

}
