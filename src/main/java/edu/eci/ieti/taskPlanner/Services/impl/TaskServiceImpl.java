package edu.eci.ieti.taskPlanner.Services.impl;

import edu.eci.ieti.taskPlanner.Model.Task;
import edu.eci.ieti.taskPlanner.Model.User;
import edu.eci.ieti.taskPlanner.Persistence.TaskRepository;
import edu.eci.ieti.taskPlanner.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> geAll() {
        return taskRepository.getAll();
    }

    @Override
    public Task getById(String id) {
        return taskRepository.getById(id);
    }

    @Override
    public List<Task> getByUserId(String userId) {
        return taskRepository.getByUserId(userId);
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return taskRepository.assignTaskToUser(taskId,user);
    }

    @Override
    public void remove(String taskId) {
        taskRepository.remove(taskId);

    }

    @Override
    public Task update(Task task) {
        return taskRepository.update(task);
    }
}
