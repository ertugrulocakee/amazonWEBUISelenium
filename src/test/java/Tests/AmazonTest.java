package Tests;

import Elements.SearchBox;
import PageObjectModels.BasketPageObjectModel;
import PageObjectModels.HomePageObjectModel;
import PageObjectModels.ProductPageObjectModel;
import PageObjectModels.ProductsPageObjectModel;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AmazonTest extends  BaseTest {

    HomePageObjectModel homePage;
    ProductsPageObjectModel productsPage;

    ProductPageObjectModel productPage;

    BasketPageObjectModel basketPage;


    @Test
    @Order(1)
    public  void searchProduct(){

        SearchBox searchBox = new SearchBox(driver);

        homePage = new HomePageObjectModel(driver,searchBox);

        homePage.acceptCookies();

        homePage.isOnHomePage();

        homePage.getSearchBox().search();


    }


    @Test
    @Order(2)
    public  void  selectProduct(){

       productsPage = new ProductsPageObjectModel(driver);

       productsPage.selectComputer();

    }

    @Test
    @Order(3)
    public  void  addProductToBasket(){

        productPage = new ProductPageObjectModel(driver);

        productPage.addBasket();


    }


    @Test
    @Order(4)
    public  void goToBasket(){

        basketPage = new BasketPageObjectModel(driver);

        basketPage.isOnBasketPage();

        basketPage.isCountOne();


    }


}
