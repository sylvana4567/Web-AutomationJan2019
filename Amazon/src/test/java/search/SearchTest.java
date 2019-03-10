package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI{

    @Test
    public void search(){
       typeOnWebElement("twotabsearchtextbox");
    }
}
