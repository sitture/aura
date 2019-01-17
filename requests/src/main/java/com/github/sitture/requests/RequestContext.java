package com.github.sitture.requests;

public final class RequestContext {

    private RequestContext() {
    }

    private static ApiRequest request;

    public static void setRequest(final ApiRequest request) {
        RequestContext.request = request;
    }

    public static ApiRequest getRequest() {
        return request;
    }

}
