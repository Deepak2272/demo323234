package com.payilagam.repository;

import org.springframework.data.repository.CrudRepository;

import com.payilagam.model.User;

public interface UserRepo extends CrudRepository<User,Integer> {
    public findbyname(String name);
}
