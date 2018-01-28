package beforeafter;

import org.testng.annotations.*;

public class TestClass {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite Method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class Method");
    }

    @BeforeGroups(groups = {"testOne"})
    public void beforeGroupsOne() {
        System.out.println("Before Groups One Method");
    }

    @AfterGroups(groups = {"testOne"})
    public void afterGroupsOne() {
        System.out.println("After Groups One Method");
    }

    @BeforeGroups(groups = {"testTwo"})
    public void beforeGroupsTwo() {
        System.out.println("Before Groups Two Method");
    }

    @AfterGroups(groups = {"testTwo"})
    public void afterGroupsTwo() {
        System.out.println("After Groups Two Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
