package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPageObjectModel extends  BasePageObjectModel{

    By pcPriceLabel = new By.ByCssSelector("span.a-price-whole");


    public ProductsPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    private List<WebElement> getAllComputers(){

        return findAllElements(pcPriceLabel);

    }



    public  void selectComputer(){


        Random r=new Random();
        int number =r.nextInt(getAllComputers().size());

        getAllComputers().get(number).click();


    }

}
