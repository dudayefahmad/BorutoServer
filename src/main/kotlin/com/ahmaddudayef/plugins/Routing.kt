package com.ahmaddudayef.plugins

import com.ahmaddudayef.routes.getAllHeroes
import com.ahmaddudayef.routes.root
import com.ahmaddudayef.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()
        static("/images") {
            resources("images")
        }
    }
}
