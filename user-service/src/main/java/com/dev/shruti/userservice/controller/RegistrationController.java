package com.dev.shruti.userservice.controller;

import com.dev.shruti.userservice.dto.ResponseDto;
import com.dev.shruti.userservice.dto.UserDto;
import com.dev.shruti.userservice.dto.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/user/register")
    public ResponseDto<UserResponseDto> RegisterUser(@RequestBody UserDto userDto) {
        return new ResponseDto<UserResponseDto>(HttpStatus.OK,new UserResponseDto(1L,userDto.getFullName(),userDto.getEmail(),true));
    }
}
