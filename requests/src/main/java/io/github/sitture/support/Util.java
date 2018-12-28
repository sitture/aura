package io.github.sitture.support;

import org.apache.commons.text.StringSubstitutor;

import java.net.URL;

public class Util {

    public static String getEnvSubstitutedString(final String value) {
        return StringSubstitutor.replace(value, System.getenv());
    }

    public static boolean isValidURI(String uri) {
        try {
            new URL(uri);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
