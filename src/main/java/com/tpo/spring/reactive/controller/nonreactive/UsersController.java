package com.tpo.spring.reactive.controller.nonreactive;

import com.tpo.spring.reactive.model.User;
import com.tpo.spring.reactive.repository.nonreactive.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UsersController {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        List<User> users = usersRepository.findAll();
        log.info("Returning all {} users", users.size());
        return users;
    }


    @PostMapping("users")
    public void postUser( @RequestBody User user){
        log.info("Creating new user: {}", user.getName());
        User newUser = usersRepository.insert(user);
        log.info("User created: {}", newUser.getId());
    }
}
