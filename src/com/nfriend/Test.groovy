#!/usr/bin/env groovy

package com.nfriend

class Test implements Serializable {

    private final String someString

    Test(String someString){
        this.someString = someString
    }

    def getBlahBlahWomp() {
        return this.someString
    }

}
