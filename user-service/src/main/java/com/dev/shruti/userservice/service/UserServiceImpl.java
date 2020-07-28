package com.dev.shruti.userservice.service;

import com.dev.shruti.userservice.dto.UserDto;
import com.dev.shruti.userservice.model.User;
import com.dev.shruti.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User RegisterUser(UserDto userDto) {
        if(userRepository.findByEmail(userDto.getEmail())!=null)
        {
            // TODO : Throws exception
        }
        User user =new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setActive(false);
        user.setPassword(userDto.getPassword()); // TODO: Encrypt Password

        User savedUser = userRepository.save(user);
        return savedUser;
    }
}
