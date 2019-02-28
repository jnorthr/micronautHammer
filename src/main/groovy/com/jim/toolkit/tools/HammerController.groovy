package com.jim.toolkit.tools

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/hammer")
class HammerController {

    @Get("/")
    HttpStatus index() {
    	println "-- HammerController --"
        return HttpStatus.OK
    }
}