package com.dev.shruti.userservice.controller;

import com.dev.shruti.userservice.dto.ResponseDto;
import com.dev.shruti.userservice.dto.UserDto;
import com.dev.shruti.userservice.dto.UserResponseDto;
import com.dev.shruti.userservice.model.User;
import com.dev.shruti.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public ResponseDto<UserResponseDto> RegisterUser(@RequestBody UserDto userDto) {
        User user = userService.RegisterUser(userDto);
        return new ResponseDto<UserResponseDto>(HttpStatus.OK,new UserResponseDto(user.getId(),user.getFullName(),user.getEmail(),user.isActive()));
    }
}
