package com.ohrm.utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    /**
     * we have alwaysRun = true because TestNG is not promising execution of
     * @Before or @After (method, suite, test, class) from xml file
     * specially if you are customizing xml with different groups
     */

    /**
     * TestNG doc says about alwaysRun = true
     * For before/after methods (beforeSuite, beforeTest, beforeTestClass and beforeTestMethod, but not beforeGroups):
     * If set to true, this configuration method will be run regardless of what groups it belongs to.
     */
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws InterruptedException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("http://dev-hrm.yoll.io/index.php/auth/validateCredentials");
        Thread.sleep(5000);
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        Driver.closeDriver();
    }

}
