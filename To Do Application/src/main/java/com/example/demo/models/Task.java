package com.example.demo.models;

import jakarta.persistence.*; 

@Entity
public class Task { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	// this is the primary key which will be auto generated 
	private int id; 
	private String task; 
	private boolean completed; 

	public Task(String task, boolean completed) { 
		this.task = task; 
		this.completed = completed; 
	} 
	public int getId() { 
		return id; 
	} 
	public void setId(int id) { 
		this.id = id; 
	} 
	public String getTask() { 
		return task; 
	} 
	public void setTask(String task) { 
		this.task = task; 
	} 
	public boolean isCompleted() { 
		return completed; 
	} 
	public void setCompleted(boolean completed) { 
		this.completed = completed; 
	} 
} 
