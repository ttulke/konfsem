package com.example.konf.xhr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class XHRController {

    @GetMapping(
            value = "/xhr",
            produces = "text/event-stream"
    )
    public Flux<String> xhr() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> "XHR-Event #" + i);
    }

}
