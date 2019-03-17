package tabletest;

import org.testng.annotations.Test;
import tabledata.TablePage;

public class TableDataTest extends TablePage {

    @Test
    public void read(){
        readTable();
    }
}
