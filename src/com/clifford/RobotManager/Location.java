package com.clifford.RobotManager;

public class Location {

	private int x, y, z;
	private float pitch = 0, yaw = 0;
	
	public Location(int x, int y, int z, float pitch, float yaw) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}
	
	public Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public float getPitch() {
		return pitch;
	}
	
	public float getYaw() {
		return yaw;
	}
	
	public void setLocation(Location newLocation) {
		this.x = newLocation.getX();
		this.y = newLocation.getY();
		this.z = newLocation.getZ();
		this.pitch = newLocation.getPitch();
		this.yaw = newLocation.getYaw();
	}
	
	@Override
	public String toString() {
		return "{x=" + x + ", y=" + y + ", z=" + z + ", pitch=" + pitch + ", yaw=" + yaw + "}";
	}
	
}