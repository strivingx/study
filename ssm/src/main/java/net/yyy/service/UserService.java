package net.yyy.service;

import net.yyy.entity.User;

public interface UserService {
    public User getById(int userId);

    boolean add(User record);

}