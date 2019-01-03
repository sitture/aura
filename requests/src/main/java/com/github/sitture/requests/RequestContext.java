package com.github.sitture.requests;

public final class RequestContext {

    private RequestContext() {
    }

    private static Request request;

    public static void setRequest(final Request request) {
        RequestContext.request = request;
    }

    public static Request getRequest() {
        return request;
    }

}
