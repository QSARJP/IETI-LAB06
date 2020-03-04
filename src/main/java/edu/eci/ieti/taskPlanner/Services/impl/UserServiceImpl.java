package edu.eci.ieti.taskPlanner.Services.impl;

import edu.eci.ieti.taskPlanner.Model.User;
import edu.eci.ieti.taskPlanner.Persistence.UserRepository;
import edu.eci.ieti.taskPlanner.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getById(String userId) {
        return userRepository.getById(userId);
    }

    @Override
    public User create(User user) {
        return userRepository.create(user);
    }

    @Override
    public User update(User user) {
        return userRepository.update(user);
    }

    @Override
    public void remove(String userId) {
        userRepository.remove(userId);
    }
}
