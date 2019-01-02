package io.github.sitture.specs;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import io.github.sitture.requests.RequestMethod;
import io.github.sitture.support.Util;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ApiSpec {

    @Step("print hello world!")
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }

    @Step("request type is <GET|POST|PUT|DELETE>")
    public void request(final RequestMethod requestMethod) {
        System.out.println(requestMethod);
        System.out.println(requestMethod.equals("GET"));
        if (requestMethod.equals("GET")) {
            String msg = "invalid";
            throw new RuntimeException(msg);
        }
    }

    @Step("print another <hello>")
    public void printAnother(final String hello) {
        try {
            // substitute env vars
            String url = Util.getEnvSubstitutedString(hello);
            // TODO: check if valid url, else throw an exception
            // TODO: Add url to the request object
            System.out.println(Unirest.get(url + "/get/helloworld").asJson().getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    static OkHttpClient client = new OkHttpClient();

    private static String run(final String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("X-haroon", "X-Sheikh")
                .build();
        //System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(request));
        Gauge.writeMessage("```%s```", new Gson().toJson(request));
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
