package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.io.IOException;
import java.sql.SQLException;

public class SearchTest extends CommonAPI{

    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
