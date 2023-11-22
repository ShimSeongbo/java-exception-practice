package org.example.service;

import org.example.exceptions.UserAlreadyRegisteredException;
import org.example.exceptions.ValidationException;

/**
 * 사용자 관리를 담당하는 서비스 클래스.
 */
public class UserService {

    /**
     * 새로운 사용자를 등록합니다.
     *
     * @param userName 등록할 사용자의 이름
     * @throws ValidationException 사용자 이름이 유효하지 않을 경우
     */
    public void registerUser(String userName) throws ValidationException {
        if (userName == null || userName.trim().isEmpty()) {
            throw new ValidationException("User name cannot be empty");
        }

        if (userNameExists(userName)) {
            throw new UserAlreadyRegisteredException("User already registered: " + userName);
        }
    }

    /**
     * 주어진 사용자 이름이 이미 존재하는지 확인합니다.
     *
     * @param userName 확인할 사용자 이름
     * @return 사용자 이름이 존재 여부
     */
    private boolean userNameExists(String userName) {
        // 실제 사용자 이름 존재 여부 확인 로직 구현
        return false; // 예시 코드로, 실제 구현 필요
    }
}
