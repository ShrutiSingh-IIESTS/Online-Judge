package com.dev.shruti.userservice.controller;

import com.dev.shruti.userservice.dto.ResponseDto;
import com.dev.shruti.userservice.dto.UserDto;
import com.dev.shruti.userservice.dto.UserResponseDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    public ResponseDto<UserResponseDto> RegisterUser(@RequestBody UserDto userDto) {

        return null;
    }

}
