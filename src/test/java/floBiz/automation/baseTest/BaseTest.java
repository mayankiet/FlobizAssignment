package floBiz.automation.baseTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.ConfigReader;
import org.apache.commons.lang3.RandomUtils;

public class BaseTest {


    protected static ConfigReader configReader = new ConfigReader();

    @BeforeTest
    public void setUp(){


        System.out.println("The test has started");
    }

    @AfterTest
    public void tearDown(){


        System.out.println("The test has ended");
    }

    public int get3DigitRandomInt(){

        return RandomUtils.nextInt(100, 999);
    }
}
