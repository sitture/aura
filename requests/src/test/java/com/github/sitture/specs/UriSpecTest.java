package com.github.sitture.specs;

import com.github.sitture.requests.RequestContext;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class UriSpecTest {

    private static UriSpec uriSpec = new UriSpec();

    @Test
    public void testCanGetURI() throws IOException {
        final String uri = "http://test.io";
        uriSpec.setRequestApiUri(uri);
        Assert.assertEquals(uri, RequestContext.getRequest().getUrl());
    }

}
