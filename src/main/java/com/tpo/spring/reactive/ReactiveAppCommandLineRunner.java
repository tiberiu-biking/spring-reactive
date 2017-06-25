package com.tpo.spring.reactive;

import com.tpo.spring.reactive.model.User;
import com.tpo.spring.reactive.repository.nonreactive.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReactiveAppCommandLineRunner implements CommandLineRunner {

    private final UsersRepository usersRepository;

    @Autowired
    public ReactiveAppCommandLineRunner(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Override
    public void run(String... strings) throws Exception {
        usersRepository.save(new User("Tibi"));
        usersRepository.save(new User("Cristina"));
        usersRepository.save(new User("Sandi"));
        usersRepository.save(new User("Cosmin"));
    }
}
