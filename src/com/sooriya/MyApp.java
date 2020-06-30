package com.sooriya;

public class MyApp {

	public static void main(String[] args) {
		
		  // using code to an interface instead of directly creating its own reference
		  // so we can plug in any type of class that implements the interface
		  // Code to an interface - best software engineering practice
          Coach theCoach = new TrackCoach();
          System.out.println(theCoach.getDailyWorkout());
	}

}
