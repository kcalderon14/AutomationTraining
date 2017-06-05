package com.gap.atpractice.dataprovider;

import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import com.gap.atpractice.utils.TxtUtils;

/**
 * Created by auto on 29/05/17.
 */
public class DataProviderLogin {

    /**
     * This method set the users into the array
     * Then they will be used in TestLogin
     */

    @DataProvider(name = "getData")
    public Object[][] getData(Method m)
    {
        System.out.println(String.format("Data Povider name:  %s", m.getName()));
        return new Object[][]{
                {"User1", "Password1"},
                {"User2", "Password2"}
        };
    }

    @DataProvider(name = "txtUsers")
    public Object[][] readFile()throws IOException {
        File txtfile = new File("/home/auto/workspace/drg-at/src/main/resources/dataproviders/usertxtlist");
        TxtUtils txt = new TxtUtils();
        Object[][] returnObjArray=txt.readTxtFile(txtfile);
        return returnObjArray;
    }
}
