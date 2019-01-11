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

    ApiRequest request;


    private HttpRequest() {

    }

    public HttpRequest(ApiRequest request) {
        this.request = request;
    }

    static OkHttpClient client = new OkHttpClient();

    public void execute() throws IOException {
        run(request.getUrl()).headers().names();
    }

    private Response run(final String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("X-haroon", "X-Sheikh")
                .build();
        Response response = client.newCall(request).execute();
        return response;
    }

}
