package com.romanlopatin.userservice1.controller;


import com.romanlopatin.userservice1.dto.AddUserRequestDto;
import com.romanlopatin.userservice1.entity.User;
import com.romanlopatin.userservice1.service.UserServise;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static liquibase.repackaged.net.sf.jsqlparser.util.validation.metadata.NamedObject.user;

@RestController("/")
public class UserController {

    ;
    private final UserServise userServise;

    public UserController(UserServise userServise) {
        this.userServise = userServise;
    }

    @GetMapping("/users")
    public String findAll() {

        return userServise.findAll().toString();
    }

    @PostMapping("/user")
    public void createUser(AddUserRequestDto addUserRequestDto)  {
        User user = new User();
        addUserRequestDto.setName(addUserRequestDto.getName());
        userServise.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        userServise.save(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        userServise.deleteById(id);
        return "User deleted with id= "+ id+ " was delete";
    }
}
