package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.WatchEvent;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Testr {
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
    @Test
    @Order(3)
    public void control1() {
        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.sendKeys("DeawpeT");

        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("genawpveme@gtkl");

        WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        button.click();
    }
    @Test
    @Order(4)
    public void control2() {
        WebElement radio = driver.findElement(By.id("id_gender1"));
        radio.click();
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("1234");
        WebElement day = driver.findElement(By.id("days"));
        Select select = new Select(day);
        select.selectByValue("6");
        WebElement mo = driver.findElement(By.id("months"));
        Select select1 = new Select(mo);
        select1.selectByVisibleText("January");
        WebElement ye = driver.findElement(By.id("years"));
        Select select2 = new Select(ye);
        select2.selectByValue("2020");
        WebElement click2 = driver.findElement(By.id("newsletter"));
        click2.click();
        WebElement click3 = driver.findElement(By.id("optin"));
        click3.click();
        WebElement firstname = driver.findElement(By.id("first_name"));
        firstname.sendKeys("Turek");
        WebElement lastname = driver.findElement(By.id("last_name"));
        lastname.sendKeys("Ogre");
        WebElement com = driver.findElement(By.id("company"));
        com.sendKeys("Amazon");
        WebElement adress = driver.findElement(By.id("address1"));
        adress.sendKeys("İstanbul Sisli");
        WebElement adress2 = driver.findElement(By.id("address2"));
        adress2.sendKeys("İstanbul Sisli");
        WebElement ulke = driver.findElement(By.id("country"));
        Select select3 = new Select(ulke);
        select3.selectByValue("Canada");
        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("Istanbul Sisli");
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Istanbul");
        WebElement zipcode = driver.findElement(By.id("zipcode"));
        zipcode.sendKeys("343434");
        WebElement number = driver.findElement(By.id("mobile_number"));
        number.sendKeys("5555555555555");
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Create Account']"));
        button2.click();
    }
    @Test
    @Order(5)
    public void control3() throws InterruptedException {
        WebElement displayed = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        displayed.isDisplayed();
        WebElement click4 = driver.findElement(By.xpath("//a[text()='Continue']"));
        click4.click();
        Thread.sleep(5000);
    }
    @Test
    @Order(6)
    public void control4(){
        WebElement click5=driver.findElement(By.xpath("//a[text()=' Delete Account']"));
        click5.isDisplayed();
        //WebElement displayed3=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        //displayed3.isDisplayed();
        //WebElement click6=driver.findElement(By.xpath("//a[text()='Continue']"));
        //click6.click();
        //WebElement home3 = driver.findElement(By.xpath("//h2[text()='Category']"));
        //Assertions.assertTrue(home3.isDisplayed());
    }
    @Test
    @Order(7)
    public void control5(){
        WebElement card=driver.findElement(By.xpath("//a[text()=' Cart']"));
        card.click();
        WebElement checkout=driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
        checkout.click();
    }
    @Test
    @Order(8)
    public void control6(){
        WebElement billing=driver.findElement(By.xpath("//li[text()='Mr. Turek Ogre']"));
        billing.isDisplayed();
    }
    @Test
    @Order(9)
    public void control7(){
        WebElement textarea= driver.findElement(By.xpath("//textarea[@class='form-control']"));
        textarea.sendKeys("Hızlı kargolamayı rica ediyoruz. İyi çalışmalar");
        WebElement click= driver.findElement(By.xpath("//a[text()='Place Order']"));
        click.click();
    }
    @Test
    @Order(10)
    public void control8(){
        WebElement textarea= driver.findElement(By.xpath("//input[@name='name_on_card']"));
        textarea.sendKeys("Team on altı");
        WebElement click= driver.findElement(By.xpath("//input[@data-qa='card-number']"));
        click.sendKeys("161616161616");
        WebElement click2= driver.findElement(By.xpath("//input[@data-qa='cvc']"));
        click2.sendKeys("161");
        WebElement click3= driver.findElement(By.xpath("//input[@data-qa='expiry-month']"));
        click3.sendKeys("12");
        WebElement click4= driver.findElement(By.xpath("//input[@data-qa='expiry-year']"));
        click4.sendKeys("2028");
        WebElement click5= driver.findElement(By.xpath("//button[@data-qa='pay-button']"));
        click5.click();
    }
}
