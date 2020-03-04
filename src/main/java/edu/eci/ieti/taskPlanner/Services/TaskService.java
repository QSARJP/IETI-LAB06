package edu.eci.ieti.taskPlanner.Services;

import edu.eci.ieti.taskPlanner.Model.Task;
import edu.eci.ieti.taskPlanner.Model.User;

import java.util.List;

public interface TaskService {
    List<Task> geAll();

    Task getById(String id);

    List<Task> getByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void remove(String taskId);

    Task update(Task task);
}
