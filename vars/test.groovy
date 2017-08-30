#!/usr/bin/env groovy

import com.nfriend.Test;

def test() {
    echo "Testing"
}

def echoTest() {
    def testClass = new Test("blah blah blah")
    return testClass.getBlahBlahWomp()
}

def envTest() {
    echo env.BRANCH_NAME
}


