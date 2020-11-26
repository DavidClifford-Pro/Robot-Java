package com.clifford.RobotFactory;

import com.clifford.Movement.MovementHandler;
import com.clifford.RobotManager.Location;
import com.clifford.TaskManager.ITask;

public class Robot extends MovementHandler {
	
	private ITask robotTask = null;
	
	private String robotName;
	
	public Robot(String robotName) {
		super();
		this.robotName = robotName;
	}
	
	// Get the robots name
	public String getRobotName() {
		return robotName;
	}
	
	// Get what the robot is currently doing
	public RobotType getRobotDuty() {
		return robotTask.getRobotTask();
	}
	
	public ITask getRobotTask() {
		return robotTask;
	}
	
	// Set the duty/task for the robot 
	public void setNewDuty(ITask newDuty) {
		if(getRobotTask() != null) {
			getRobotTask().cancelTask();
		}
		this.robotTask = newDuty;
	}
	
	public void decomissionRobot() {
		if(getRobotTask() != null) {
			getRobotTask().cancelTask();
		}
		returnToBase();
	}
	
	
	// Return the robot to home
	public void returnToBase() {
		// Have the robot walk home
		this.setLocation(new Location(0, 0, 0));
	}
}