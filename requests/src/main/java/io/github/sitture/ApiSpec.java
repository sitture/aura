package io.github.sitture;

import com.thoughtworks.gauge.Step;

public class ApiSpec {

    @Step("print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    @Step("print another")
    public void printAnother() {
        System.out.println("Hello World Again!");
    }

}
