package org.example.exceptions;

/**
 * 데이터 중복 시 예외 클래스.
 */
public class DuplicatedException extends ValidationException {


    /**
     * ValidationException 생성자
     *
     * @param message 예외에 대한 메시지
     */
    public DuplicatedException(String message) {
        super(message);
    }

    // DuplicatedException 에 대한 기능과 속성 정의
}
