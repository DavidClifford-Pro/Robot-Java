package com.clifford.TaskManager;

import com.clifford.RobotFactory.RobotType;

public class LawnCareTask implements ITask {
private int elapsedTime = 0;
	
	private boolean isTaskActive = false;
	
	private RobotType taskType;
	
	public LawnCareTask() {
		this.taskType = RobotType.LAWN_CARE;
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
		this.taskType = RobotType.IDLE;
		this.isTaskActive = false;
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
