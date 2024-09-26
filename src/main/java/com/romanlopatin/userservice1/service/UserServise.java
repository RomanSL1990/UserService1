package com.romanlopatin.userservice1.service;

import com.romanlopatin.userservice1.entity.User;
import com.romanlopatin.userservice1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServise {

    private final UserRepository userRepository;

    public UserServise(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(int id) {
        return userRepository.getOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User save(User user) {
       return userRepository.save(user);
    }

    public void deleteById (int id) {
        userRepository.deleteById(id);
    }
}

