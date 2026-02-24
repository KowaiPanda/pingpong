package com.example.pingpong;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    @MessageMapping("/move")
    @SendTo("/topic/game")
    public GameMessage processMove(GameMessage message) {
        return message; // Echoes the message (Paddle OR Ball) to all clients
    }
}