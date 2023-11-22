package org.example.exceptions;

/**
 * 이미 등록된 사용자 예외 클래스
 */
public class UserAlreadyRegisteredException extends ValidationException {

    /**
     * ValidationException 생성자
     *
     * @param message 예외에 대한 메시지
     */
    public UserAlreadyRegisteredException(String message) {
        super(message);
    }

    // UserAlreadyRegisteredException 에 대한 기능과 속성 정의
}
