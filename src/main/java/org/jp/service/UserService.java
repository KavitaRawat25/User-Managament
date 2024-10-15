package org.jp.service;

import org.jp.dto.UserDto;

public interface UserService {
    UserDto createUserDto(UserDto userDto);

    UserDto updateUserById(Long id, UserDto userDto);

}
