package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }


    @Override
    public List<User> printUsers() {
        return dao.listUsers();
    }

    @Override
    public void deleteById(Long id) {
        dao.removeUser(id);
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public User findById(Long id) {
        return dao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }
}
