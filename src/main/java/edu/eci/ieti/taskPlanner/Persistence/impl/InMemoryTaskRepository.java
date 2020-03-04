package edu.eci.ieti.taskPlanner.Persistence.impl;

import edu.eci.ieti.taskPlanner.Model.Task;
import edu.eci.ieti.taskPlanner.Model.User;
import edu.eci.ieti.taskPlanner.Persistence.TaskRepository;

import java.util.List;


public class InMemoryTaskRepository implements TaskRepository {

    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public Task getById(String id) {
        return null;
    }

    @Override
    public List<Task> getByUserId(String userId) {
        return null;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return null;
    }

    @Override
    public void remove(String taskId) {

    }

    @Override
    public Task update(Task task) {
        return null;
    }
}
