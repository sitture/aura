package com.github.sitture.specs;

import com.github.sitture.helpers.UriHelper;
import com.github.sitture.requests.HttpRequest;
import com.github.sitture.requests.RequestContext;
import com.thoughtworks.gauge.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UriSpec extends HelperSpec {

    @Step({"set URI to <requestApi>", "set requests URI to <requestApi>"})
    public void setRequestApiUri(final String requestApi) throws IOException {
        // substitute env vars
        String uri = UriHelper.getEnvSubstitutedString(requestApi);
        // TODO: check if valid url, else throw an exception
        if (!UriHelper.isValidURI(uri)) {
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

        new HttpRequest(getRequest()).execute();
    }

}
