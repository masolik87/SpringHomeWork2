package com.example.CRUD.service;

import com.example.CRUD.model.User;
import com.example.CRUD.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public Object deleteById;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
    public User getOne(int id) {
        System.out.println("User service get id: " +id);
        return userRepository.getOne(id);
    }
    public User updateUser(User user) {
        return userRepository.update(user);
    }
}