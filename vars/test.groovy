#!/usr/bin/env groovy

import com.nfriend.Test;

def test() {
    echo "Testing"
}

def echoTest() {
    Test testClass = new Test("I Got This From The Test Class!")
    return testClass.getSomeString()
}

def envTest() {
    echo env.BRANCH_NAME
}


