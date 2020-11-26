package com.clifford.TaskManager;

import com.clifford.RobotFactory.RobotType;

public interface ITask {
	
	public int getElapsedTime();
	
	public void cancelTask();
	
	public void startTask();
	
	public boolean isTaskActive();
	
	public RobotType getRobotTask();
	
}