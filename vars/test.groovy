#!/usr/bin/env groovy

import com.nfriend.Test;



def test() {
    echo "Testing"
}

def echoTest() {
    testClass = new Test("blah blah blah")
    echo testClass.getBlahBlahWomp()
}


def envTest() {
    echo env.BRANCH_NAME
}




