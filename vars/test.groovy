#!/usr/bin/env groovy

import com.nfriend.Test;

testClass = new Test("blah blah blah")

def test() {
    echo "Testing"
}

def echoTest() {
    echo testClass.getBlahBlahWomp()
}


def envTest() {
    echo env.BRANCH_NAME
}


