package com.backend.server.service;

import com.backend.server.Model.Inventory;
import com.backend.server.Model.User;
import java.util.List;

import java.util.Optional;


public interface UserService {
    public User addUser(User user);
    public Optional<User> getUser(String email);

    User updateUser(User user);

    String deleteUser(String mobileNumber);
    public List<User> getAllUser();

//    Inventory addItemToCart(Inventory inventory);
}
