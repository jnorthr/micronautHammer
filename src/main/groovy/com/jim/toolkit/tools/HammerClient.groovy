package com.jim.toolkit.tools

import io.micronaut.http.client.annotation.Client
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Client("hammer")
interface HammerClient {

    @Get("/")
    HttpStatus index()
}