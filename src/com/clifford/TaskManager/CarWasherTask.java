package com.clifford.TaskManager;

import com.clifford.RobotFactory.RobotType;

public class CarWasherTask implements ITask{

	private int elapsedTime = 0;
	private boolean isTaskActive = false;
	
	private RobotType taskType;
	
	public CarWasherTask() {
		this.taskType = RobotType.CAR_WASHER;
	}
	
	public int getElapsedTime() {
		return elapsedTime;
	}
	
	public void startTask() {
		if(!isTaskActive) {
			isTaskActive = true;
		}
	}
	
	public void cancelTask() {
		this.isTaskActive = false;
		this.taskType = RobotType.IDLE;
	}
	
	public boolean isTaskActive() {
		return isTaskActive;
	}
	
	public RobotType getRobotTask() {
		return taskType;
	}
	
	private void ticker() {
		elapsedTime+=1;	
	}
	
}