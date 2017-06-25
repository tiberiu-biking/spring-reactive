package com.tpo.spring.reactive.repository.nonreactive;

import com.tpo.spring.reactive.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends MongoRepository<User, String> {

    List<User> findByName(String lastName);
}
