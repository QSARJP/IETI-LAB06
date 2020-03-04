package edu.eci.ieti.taskPlanner.Persistence.impl;

import edu.eci.ieti.taskPlanner.Model.User;
import edu.eci.ieti.taskPlanner.Persistence.UserRepository;

import java.util.List;

public class InMemoryUserRepository implements UserRepository {

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(String userId) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void remove(String userId) {

    }
}
