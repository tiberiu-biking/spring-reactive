package com.tpo.spring.reactive;

import com.tpo.spring.reactive.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

//@RestController("/reactive/users")
public class UsersReactiveController {

    @RequestMapping
    public Flux<User> getReactiveUsers(){
        return null;
    }
}
