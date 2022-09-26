package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageObjectModel extends  BasePageObjectModel{

    By addBasketButton =  By.id("add-to-cart-button");

    public ProductPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void  addBasket(){

        scrollDown();

        averageStop();

        select(addBasketButton);

    }

}
