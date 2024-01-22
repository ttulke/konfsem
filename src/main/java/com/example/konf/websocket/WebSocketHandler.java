package com.example.konf.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

public class WebSocketHandler
        extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(
            WebSocketSession session,
            TextMessage message
    ) throws IOException {
        session.sendMessage(new TextMessage(
                "reply to " +
                message.getPayload()));
    }
}
