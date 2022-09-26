package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPageObjectModel extends  BasePageObjectModel {

    By addedToBasketLabel = new By.ByCssSelector("span.a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold");
    By basketCountLabel = By.id("nav-cart-count");

    public BasketPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }


    public  boolean isOnBasketPage(){

        longStop();

        return  isDisplayed(addedToBasketLabel);

    }

    public  boolean isCountOne(){

         String countValueString =  findElement(basketCountLabel).getText();

         int countValue = Integer.valueOf(countValueString);

         System.out.println(countValue);


         if(countValue == 1){

             return  true;
         }

        return  false;

    }


}
