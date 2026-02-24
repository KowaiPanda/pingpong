package com.example.pingpong;

public class GameMessage {
    private String type;   // "PADDLE" or "BALL"
    private String player; // "player1" or "player2"
    
    // Paddle Data
    private int paddleY;

    // Ball Data
    private double ballX;
    private double ballY;

    // Getters and Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }
    
    public int getPaddleY() { return paddleY; }
    public void setPaddleY(int paddleY) { this.paddleY = paddleY; }
    
    public double getBallX() { return ballX; }
    public void setBallX(double ballX) { this.ballX = ballX; }
    
    public double getBallY() { return ballY; }
    public void setBallY(double ballY) { this.ballY = ballY; }
}