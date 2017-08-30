#!/usr/bin/env groovy

import com.nfriend.Test;

def test() {
    echo "Testing"
}

def echoTest() {
    Test testClass = new Test()
    return testClass.getSomeString()
}

def envTest() {
    echo env.BRANCH_NAME
}


