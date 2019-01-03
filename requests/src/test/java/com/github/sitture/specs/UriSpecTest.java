package com.github.sitture.specs;

import com.github.sitture.requests.RequestContext;
import org.junit.Assert;
import org.junit.Test;

public class UriSpecTest {

    private static UriSpec uriSpec = new UriSpec();

    @Test
    public void testCanGetURI() {
        final String uri = "http://exampleuri.io";
        uriSpec.setRequestApiUri(uri);
        Assert.assertEquals(uri, RequestContext.getRequest().getUrl());
    }

}
