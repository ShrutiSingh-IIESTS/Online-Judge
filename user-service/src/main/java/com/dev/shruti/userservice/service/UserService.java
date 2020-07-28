package com.dev.shruti.userservice.service;

import com.dev.shruti.userservice.dto.UserDto;
import com.dev.shruti.userservice.model.User;

public interface UserService {
    User RegisterUser(UserDto userDto);
}
