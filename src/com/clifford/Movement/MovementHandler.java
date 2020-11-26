package com.clifford.Movement;

import com.clifford.RobotManager.Location;

public class MovementHandler {
	
	private Location location;
	
	public MovementHandler() {
		this.location = new Location(0, 0, 0);
		automationTimer();
	}
	
	// Get the location of the robot
	public Location getLocation() {
		return location;
	}
		
		// Set the location of the robot
	public void setLocation(Location newLocation) {
		this.location = newLocation;
	}
	
	// Move the robot forward 1
	public void moveForward() {}
	
	// Move the robot backwards 1
	public void moveBackwards() {}
	
	// Turn the head side to side
	public void turn(int degree) {}
	
	// Turn the head up and down
	public void lookAround(int degree) {}
	
	// Code goes here that will allow the robot to roam around the area it's assigned to do it's task
	private void automationTimer() {}
	
}
