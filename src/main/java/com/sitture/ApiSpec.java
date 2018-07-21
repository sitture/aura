package com.sitture;

import com.thoughtworks.gauge.Step;

public class ApiSpec {

    @Step("print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

}
