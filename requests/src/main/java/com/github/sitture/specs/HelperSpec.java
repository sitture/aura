package com.github.sitture.specs;

import com.github.sitture.requests.ApiRequest;

abstract class HelperSpec {

    private ApiRequest request;

    HelperSpec() {
        this.request = new ApiRequest();
    }

    protected ApiRequest getRequest() {
        return request;
    }

}
