package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        //You may change this to access any other local URL
        driver.get("http://bs-local.com:45691/check");
        Assert.assertTrue(driver.getPageSource().contains("Up and running"));
    }
}
