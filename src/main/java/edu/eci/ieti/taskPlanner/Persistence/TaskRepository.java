package edu.eci.ieti.taskPlanner.Persistence;

import edu.eci.ieti.taskPlanner.Model.Task;
import edu.eci.ieti.taskPlanner.Model.User;

import java.util.List;

public interface TaskRepository {
    List<Task> getAll();

    Task getById(String id);

    List<Task> getByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void remove(String taskId);

    Task update(Task task);
}
