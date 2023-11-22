package org.example.exceptions;

public class ValidationException extends Exception {

    /**
     * ValidationException 생성자
     *
     * @param message 예외에 대한 메시지
     */
    public ValidationException(String message) {
        super(message);
    }

    // 추가 공통 기능과 속성을 정의
}

