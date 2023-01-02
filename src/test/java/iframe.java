import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class iframe {
    WebDriver driver;
    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterAll
    public void down(){
        driver.close();
    }
    /*
    1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
 2 ) Bir metod olusturun: iframeTest
 - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
 - Text Box’a “Merhaba Dunya!” yazin.
 - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.
     */
    @Test
    public void control() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement actualsayfayazisi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(actualsayfayazisi.isEnabled());
        Thread.sleep(3000);
        WebElement iframe= driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement ad=driver.findElement(By.xpath("//body[@id='tinymce']"));
        ad.clear();
        ad.sendKeys("Hello World");
        Thread.sleep(3000);

        //driver.switchTo().parentFrame(); //div[text()='Powered by ']
        driver.switchTo().defaultContent();//ana sayfaya gecis icin
        WebElement element=driver.findElement(By.xpath("//div[text()='Powered by ']"));
        Assert.assertTrue(element.isDisplayed());
        System.out.println(element.getText());







    }
}
