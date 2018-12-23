package io.github.sitture;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.thoughtworks.gauge.Step;

public class ApiSpec {

    @Step("print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }

    @Step("print another <hello>")
    public void printAnother(String hello) {
        System.out.println("Hello " + hello);
        try {
            System.out.println(Unirest.get("http://stubapi:8080/mock/api").asJson().getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

}
