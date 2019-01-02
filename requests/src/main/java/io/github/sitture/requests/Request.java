package io.github.sitture.requests;

import java.util.List;

public final class Request {

    String url;

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

    List<String> headers;

}
