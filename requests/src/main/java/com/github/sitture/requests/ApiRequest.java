package com.github.sitture.requests;

import java.util.List;

public final class ApiRequest {

    private String url;

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(final List<String> headers) {
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    private List<String> headers;

}
