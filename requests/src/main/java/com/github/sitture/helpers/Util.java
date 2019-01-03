package com.github.sitture.support;

import org.apache.commons.text.StringSubstitutor;

import java.net.MalformedURLException;
import java.net.URL;

public final class Util {

    private Util() {

    }

    public static String getEnvSubstitutedString(final String value) {
        return StringSubstitutor.replace(value, System.getenv());
    }

    public static boolean isValidURI(final String uri) {
        try {
            new URL(uri);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

}
