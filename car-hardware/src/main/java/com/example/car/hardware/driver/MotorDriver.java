package com.example.car.hardware.driver;

public interface MotorDriver {
    void forward(int speed);
    void backward(int speed);
    void turnLeft(int speed);
    void turnRight(int speed);
    void stop();
    void setSpeed(int leftSpeed, int rightSpeed); // 精准控制
}
