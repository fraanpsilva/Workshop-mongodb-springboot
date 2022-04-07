package com.fcsilva.workshopmongodb.services;

import com.fcsilva.workshopmongodb.domain.User;
import com.fcsilva.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User>findAll(){
        return userRepository.findAll();

    }
}
