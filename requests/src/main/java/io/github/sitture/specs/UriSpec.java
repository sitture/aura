package io.github.sitture.specs;

import com.thoughtworks.gauge.Step;
import io.github.sitture.support.Util;

public class UriSpec {

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
        System.out.println(uri);
    }

}
