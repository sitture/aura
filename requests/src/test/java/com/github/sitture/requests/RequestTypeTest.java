package com.github.sitture.requests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class RequestTypeTest {

    @Test
    public void hasGET() {
        Assert.assertThat(RequestType.GET, CoreMatchers.notNullValue());
    }

}
