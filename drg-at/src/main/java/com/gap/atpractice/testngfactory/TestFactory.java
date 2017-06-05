package com.gap.atpractice.testngfactory;

import com.gap.atpractice.testSuites.TestLoginSeveralTimes;
import org.testng.annotations.Factory;


/**
 * Created by auto on 01/06/17.
 */
public class TestFactory{

    @Factory
    public Object[] createInstances(){
        String name = "User";
        String password = "1234";

        Object[] result = new Object[3];
        for (int i = 0; i < 3; i++){
            result[i] = new TestLoginSeveralTimes(name+i, password+i);
        }
        return result;
    }

}
