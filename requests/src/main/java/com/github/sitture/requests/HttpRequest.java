package com.github.sitture.requests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.text.StringSubstitutor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class HttpRequest {

    private HttpRequest() {

    }

    static OkHttpClient client = new OkHttpClient();

    public static void main(final String[] args) throws IOException {
        System.out.println(run("http://localhost:8080/mock/api"));
        com.github.sitture.requests.Request request = new com.github.sitture.requests.Request();
        request.setUrl("https://local");
        List<String> a = new ArrayList<>();
        a.add("haroon");
        request.setHeaders(a);
        System.out.println(new Gson().toJson(request));
        System.out.println(StringSubstitutor.replace("${PATH}", System.getenv()));
    }

    private static String run(final String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("X-haroon", "X-Sheikh")
                .build();
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(request));
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
