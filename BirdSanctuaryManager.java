package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdList = new ArrayList<Bird>();
		
	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);
	}
	
	public void print() {
/*		for(Object bird: birdList) {
			System.out.println(bird);
		}
*/		
		birdList.stream().forEach(System.out::println);
	
	}
	
	public void printFlyable() {
		/*
		 * for(Object o: birdList) { if(o instanceof Flyable) { System.out.println(o); }
		 * }
		 */	
		birdList.stream().filter(element -> element instanceof Flyable).forEach(System.out::println);
	}
}
