package com.arthurvinicius.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arthurvinicius.mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
