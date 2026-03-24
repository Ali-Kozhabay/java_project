package com.learning.service;

import com.learning.dto.UserRequest;
import com.learning.entity.User;
import com.learning.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final  UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserRequest request) {
        User userEntity = new User();
        userEntity.setName(request.getName());
        userEntity.setAge(request.getAge());

        return userRepository.save(userEntity);
    }
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
