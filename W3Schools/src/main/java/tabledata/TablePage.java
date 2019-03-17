package tabledata;

import base.CommonAPI;

import java.util.List;

public class TablePage extends CommonAPI {

    public void readTable(){
       List<String> dataList =  getTextFromWebElements(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(4)");
       for(String st:dataList){
           System.out.println(st);
       }
    }
}
