package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BasePageObjectModel {

    WebDriver driver;

    public BasePageObjectModel(WebDriver webDriver) {

        this.driver = webDriver;

    }

    public WebElement findElement(By locator){

        return  driver.findElement(locator);

    }


    public List<WebElement> findAllElements(By locator){

        return driver.findElements(locator);

    }

    public  void select(By locator){

        findElement(locator).click();

    }


    public  void write(By locator,String text){

        findElement(locator).sendKeys(text);

    }

    public  void  remove(By locator){

        findElement(locator).clear();

    }

    public  Boolean isDisplayed(By locator){

        return  findElement(locator).isDisplayed();

    }

    public  void moveToElement(By locator){


        Actions action = new Actions(driver);

        WebElement element = findElement(locator);
        action.moveToElement(element).perform();

    }


    public void shortStop(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public  void averageStop(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public  void longStop(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public  void  scrollDown(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,200)");

    }

}
