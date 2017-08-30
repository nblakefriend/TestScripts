#!/usr/bin/env groovy

package com.nfriend

class Test {

    private final String someString

    Test(String someString){
        this.someString = someString
    }

    @NonCPS
    String getBlahBlahWomp() {
        return this.someString
    }

}
