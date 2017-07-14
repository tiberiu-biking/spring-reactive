package com.tpo.spring.reactive.controller.reactive;

import com.tpo.spring.reactive.model.User;
import com.tpo.spring.reactive.repository.reactive.UserReactiveRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
public class UserReactiveController {

    private final UserReactiveRepository userReactiveRepository;

    @Autowired
    public UserReactiveController(UserReactiveRepository userReactiveRepository) {
        this.userReactiveRepository = userReactiveRepository;
    }

    @GetMapping("/user")
    public Flux<User> getAllReactiveUsers() {
        return userReactiveRepository.findAll();
    }

    @PostMapping("/user")
    public void postReactiveUser(@RequestBody User user) {
        userReactiveRepository.insert(user);
    }
}
