package com.github.sitture.helpers;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class UriHelperTest {

    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    @Test
    public void testEnvVariablesSubstituted() {
        environmentVariables.set("myVariable", "myValue");
        Assert.assertEquals("myValue", UriHelper.getEnvSubstitutedString("${myVariable}"));
    }
}
