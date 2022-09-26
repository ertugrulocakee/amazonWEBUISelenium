package PageObjectModels;

import Elements.SearchBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjectModel extends  BasePageObjectModel{

    By acceptCookiesButton = By.xpath("/html/body/div[1]/span/form/div[3]/span[1]/span/input");

    By logo = By.id("nav-logo-sprites");

    private SearchBox searchBox;

    public HomePageObjectModel(WebDriver webDriver,SearchBox searchBox) {
        super(webDriver);
        this.searchBox = searchBox;
    }


    public  void  acceptCookies(){


        select(acceptCookiesButton);


    }

    public  boolean isOnHomePage(){

        shortStop();

        return  isDisplayed(logo);

    }


    public  SearchBox getSearchBox(){

        return  this.searchBox;

    }



}
