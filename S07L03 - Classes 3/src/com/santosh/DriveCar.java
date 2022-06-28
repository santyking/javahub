package com.santosh;

public class DriveCar {

	public static void main(String[] args) {
		OperateCar car = new OperateCar();
		car.setDoors("Closed");
		car.setDriver("Seated");
		car.setEngine("On");
		car.setSpeed(10);
		if (
				car.getDoors()=="Closed" &&
				car.getDriver()=="Seated" &&
				car.getEngine()=="On" &&
				car.getSpeed()>=0
			) {
				System.out.println("Car is Running");
		} 
		else {
				System.out.println("Car is not running");
		}
	}

}
