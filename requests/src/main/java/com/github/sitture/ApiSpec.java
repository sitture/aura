package io.github.sitture;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.thoughtworks.gauge.Step;
import io.github.sitture.requests.RequestType;

public class ApiSpec {

    @Step("print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }

    @Step("request type is <requestType>")
    public void request(RequestType requestType) {
        System.out.println(requestType);
    }

    @Step("print another <hello>")
    public void printAnother(String hello) {
        try {
            final String url = System.getenv("base_url");
            System.out.println(Unirest.get(url + "/mock/api").asJson().getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

}
