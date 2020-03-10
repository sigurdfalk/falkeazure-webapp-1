package no.falkeazure.webapp1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TestResource {
    @GetMapping("/ping")
    fun ping(): String = "pong!"
}