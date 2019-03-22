package com.github.sitture.requests;

import org.junit.Assert;
import org.junit.Test;

public class RequestMethodTest {

    @Test
    public void hasGET() {
        Assert.assertNotNull(RequestMethod.GET);
        Assert.assertNotNull(RequestMethod.POST);
        Assert.assertNotNull(RequestMethod.PUT);
    }

}
