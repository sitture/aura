package com.github.sitture.requests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class RequestMethodTest {

    @Test
    public void hasGET() {
        Assert.assertThat(RequestMethod.GET, CoreMatchers.notNullValue());
    }

}
