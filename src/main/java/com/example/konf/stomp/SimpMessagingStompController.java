package com.example.konf.stomp;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class SimpMessagingStompController {

    private final SimpMessagingTemplate smt;

    @MessageMapping("/simp-message")
    public void sendPublicMessage(String msg) {
        smt.convertAndSend("/topic/public", msg);
    }
}