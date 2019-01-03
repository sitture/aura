package com.github.sitture.specs;

import com.github.sitture.requests.RequestContext;
import com.thoughtworks.gauge.Step;
import com.github.sitture.helpers.Util;

import java.util.ArrayList;
import java.util.List;

public class UriSpec extends HelperSpec {

    @Step({"set URI to <requestApi>", "set requests URI to <requestApi>"})
    public void setRequestApiUri(final String requestApi) {
        // substitute env vars
        String uri = Util.getEnvSubstitutedString(requestApi);
        // TODO: check if valid url, else throw an exception
        if (!Util.isValidURI(uri)) {
            System.out.println("not a valid uri");
            return;
        }
        // TODO: Add url to the request object
        getRequest().setUrl(uri);
        List<String> s = new ArrayList<>();
        s.add("s");
        s.add("s2");
        getRequest().setHeaders(s);
        RequestContext.setRequest(getRequest());
    }

}
