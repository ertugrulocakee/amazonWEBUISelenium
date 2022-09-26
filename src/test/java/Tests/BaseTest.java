package Tests;

import TestLoggers.TestResultLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public  void  setup(){

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();

        driver.get("https://www.amazon.com.tr/");

        driver.manage().window().maximize();


    }


    @AfterAll
    public  void  tearDown(){

        driver.quit();

    }

}
