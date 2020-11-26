package com.clifford.TaskManager;

import com.clifford.RobotFactory.RobotType;

public class MaidTask implements ITask{
	
	private int elapsedTime = 0;
	private boolean isTaskActive = false;
	
	private RobotType taskType;
	
	public MaidTask() {
		this.taskType = RobotType.MAID;
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