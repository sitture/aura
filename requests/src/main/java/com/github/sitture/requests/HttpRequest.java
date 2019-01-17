package com.github.sitture.requests;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public final class HttpRequest {

    ApiRequest request;


    private HttpRequest() {

    }

    public HttpRequest(final ApiRequest request) {
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
