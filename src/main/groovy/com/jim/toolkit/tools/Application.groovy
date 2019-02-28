package com.jim.toolkit.tools

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
    	println "-- hello from Application.groovy"
        Micronaut.run(Application)
    }
}