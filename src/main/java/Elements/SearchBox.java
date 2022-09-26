package Elements;

import PageObjectModels.BasePageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePageObjectModel {

    By searchPanel = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div[1]/input");
    By searchButton = By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[4]/div/span/input");



    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }

    public  void  search(){

        write(searchPanel,"bilgisayar");

        shortStop();

        select(searchButton);

    }

}
