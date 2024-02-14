package com.example.demo.services;

import com.example.demo.models.Task; 
import com.example.demo.repositories.TaskRepository; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

import java.util.List; 

@Service
public class TaskService { 
	@Autowired
	private TaskRepository taskRepository; 
	
	public Task createNewTask(Task task) { 
		return taskRepository.save(task); 
	} 
	
	public List<Task> getAllTask() { 
		return taskRepository.findAll(); 
	} 
	
	public Task findTaskById(Long id) { 
		return taskRepository.getById(id); 
	} 
	
	public List<Task> findAllCompletedTask() { 
		return taskRepository.findByCompletedTrue(); 
	} 
	
	public List<Task> findAllInCompleteTask() { 
		return taskRepository.findByCompletedFalse(); 
	} 
	
	public void deleteTask(Task task) { 
		taskRepository.delete(task); 
	} 
	
	public Task updateTask(Task task) { 
		return taskRepository.save(task); 
	} 
} 
