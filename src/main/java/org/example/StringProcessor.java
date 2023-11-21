package org.example;

// Bad Practice
public class StringProcessor {
    public String processBad(String input) {
        if (input.isEmpty()) {
            return ""; // 입력이 빈 문자열일 때 빈 문자열 반환
        }
        // 처리 로직
        return "Processed " + input;
    }

    // Good Practice
    public String processGood(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty."); // 입력이 빈 문자열일 때 예외 발생
        }
        // 처리 로직
        return "Processed " + input;
    }
}
