package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
public class Driver {
    /* Driver class'indan driver'i getDriver() ile kullaniyoruz
       Sonradan projeye katilan insanlarin Driver class'indan obje olusturarak
       driver kullanmaya calismalarini engellemek icinn
       Driver class'ini SINGLETON PATERN ile duzenleyebiliriz
       Bunun icin Driver class'inin parametresiz constructor'ini olusturup
       access modifier'ini PRIVATE yapmamiz yeterli olur.
     */

    private Driver(){

    }
    static WebDriver driver;
    public static WebDriver getDriver(){
        String browser= configReader.getProperty("browser");
        if(driver==null) {

            switch (browser) {
                case "firefox":
                    driver=new FirefoxDriver();
                    break;

                case "Edge" :
                    driver= new EdgeDriver();
                    break;

                default:
                    driver = new ChromeDriver();

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
    @AfterTest
    public static void afterTest(){
        Driver.closeDriver();
        Driver.quitDriver();
    }
    @BeforeTest
    public static void beforeTest(){

    }
}
