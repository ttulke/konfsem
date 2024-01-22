package com.example.konf.sse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class SSEController {

    @GetMapping(
            value = "/sse",
            produces = "text/event-stream"
    )
    public Flux<String> sse() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> "Event #" + i);
    }
}
