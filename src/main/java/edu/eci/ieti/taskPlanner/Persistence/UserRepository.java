package edu.eci.ieti.taskPlanner.Persistence;

import edu.eci.ieti.taskPlanner.Model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
