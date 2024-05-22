package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.HomePageML;
import pages.ResultPageML;

public class BaseTest {
    WebDriver driver;
    HomePageML homePageML;


    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mercadolibre.com.ar/");
        driver.manage().window().maximize();
        homePageML = new HomePageML(driver);
    }

}
