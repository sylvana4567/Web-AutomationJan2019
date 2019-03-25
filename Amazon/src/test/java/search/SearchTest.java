package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class SearchTest extends CommonAPI{

    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException{
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
