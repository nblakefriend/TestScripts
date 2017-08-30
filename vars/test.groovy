#!/usr/bin/env groovy

import com.nfriend.Test;

def test() {
    echo "Testing"
}

def echoTest() {
    testClass = new Test("I Got This From The Test Class!")
    echo testClass.getSomeString()
}


