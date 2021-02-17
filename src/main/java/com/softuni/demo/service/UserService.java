package com.softuni.demo.service;


import com.softuni.demo.models.service.UserServiceModel;

public interface UserService {

    void addToDatabase(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

}
