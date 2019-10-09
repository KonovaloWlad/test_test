package test;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDrivers {
    public ChromeDriver driver;
    public WebDriverWait wait;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\webdriverchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,20);
        // driver.manage().window().setSize(new Dimension(100,100));
        System.out.println("test started");}

    @After
    public void close(){
        //  driver.quit();
        System.out.println("test closed");
    }

}

