package com.tpo.spring.reactive;

import com.tpo.spring.reactive.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@RestController("/users")
public class UsersController {

    @RequestMapping
    public List<User> getUsers(){
        return Arrays.asList(new User("1", "tibi"));
    }
}
