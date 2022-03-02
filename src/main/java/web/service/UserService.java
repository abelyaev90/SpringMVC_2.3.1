package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> printUsers();
    void deleteById(Long id);
    void addUser(User user);
    User findById(Long id);
    void updateUser(User user);
}
