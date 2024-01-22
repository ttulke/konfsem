package com.example.konf.stomp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class StompController {

    @MessageMapping("/message")
    @SendTo("/topic/public")
    public String replyTo(String msg) {
        return "reply to " + msg;
    }

}
