#!/usr/bin/env groovy

import com.nfriend.Test;

testClass = new Test("I Got This From The Test Class!")

def test() {
    echo "Testing"
}

def echoTest() {
    echo testClass.echoSomeString()
}