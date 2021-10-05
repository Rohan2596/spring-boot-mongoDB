package com.rohan2596.springbootmongodb.repository;

import com.rohan2596.springbootmongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 * */
@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
