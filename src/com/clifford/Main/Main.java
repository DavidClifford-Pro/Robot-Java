package com.clifford.Main;

import com.clifford.RobotFactory.Robot;
import com.clifford.RobotManager.Location;
import com.clifford.TaskManager.ITask;
import com.clifford.TaskManager.MaidTask;

public class Main {

	public static void main(String args[]) {
		
		Robot robot = new Robot("David");
		robot.setNewDuty((ITask)new MaidTask());
		robot.setLocation(new Location(4, 2, 1));
		
		System.out.println("---- Robot ----");
		System.out.println("Name: " + robot.getRobotName());
		System.out.println("Location: " + robot.getLocation().toString());
		System.out.println("Task: " + robot.getRobotTask().getRobotTask());
		
		
		System.out.println("--- Decommissioning robot ----");
		robot.decomissionRobot();
		System.out.println("Name: " + robot.getRobotName());
		System.out.println("Location: " + robot.getLocation().toString());
		System.out.println("Task: " + robot.getRobotTask().getRobotTask());
	}
}