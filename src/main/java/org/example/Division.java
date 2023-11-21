package org.example;

// Bad Practice
public class Division {
    public int divideBad(int a, int b) {
        if (b == 0) {
            return -1; // 0으로 나눌 때 -1 반환
        }
        return a / b;
    }

// Good Practice
    public int divideGood(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed."); // 0으로 나눌 때 예외 발생
        }
        return a / b;
    }
}
