package org.example.service;

import org.example.exceptions.UserAlreadyRegisteredException;
import org.example.exceptions.ValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.ImmutableDescriptor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserService 에 대한 테스트 클래스.
 */
class UserServiceTest {

    private UserService userService;

    /**
     * 각 테스트 실행 전에 UserService 인스턴스를 초기화합니다.
     */
    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    /**
     * 빈 사용자 이름에 대한 유효성 검사 테스트.
     */
    @Test
    void testRegisterUserWithEmptyName() {
        assertThrows(ValidationException.class, () -> userService.registerUser(""));
    }

    /**
     * 이미 등록된 사용자 이름에 대한 테스트.
     */
    @Test
    void testRegisterUserAlreadyRegistered() {
        UserService userServiceWithExistingUser = new UserService() {
            protected boolean userNameExists(String userName) {
                return true; // 이미 존재하는 사용자 이름으로 가정
            }
        };

        assertThrows(UserAlreadyRegisteredException.class, () -> userServiceWithExistingUser.registerUser("existingUser"));
    }

}