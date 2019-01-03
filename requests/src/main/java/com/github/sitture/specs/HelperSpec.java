package com.github.sitture.specs;

import com.github.sitture.requests.Request;

abstract class HelperSpec {

    private Request request;

    HelperSpec() {
        this.request = new Request();
    }

    protected Request getRequest() {
        return request;
    }

}
