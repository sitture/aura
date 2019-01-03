package com.github.sitture.requests;

public final class RequestContext {

    private RequestContext() {

    }

    public static void setRequest(final Request request) {
        RequestContext.request = request;
    }

    public static Request getRequest() {
        return request;
    }

    private static Request request;

}
