package com.bridgelabz.birdsanctuary;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the bird sanctuary");
		Bird duck = new Duck("d1");
		Bird parrot = new Parrot("p1");
		Bird penguin = new Penguin("pe1");
		
		BirdSanctuaryManager dataManager = new BirdSanctuaryManager();
		dataManager.add(duck);
		dataManager.add(parrot);
		dataManager.add(penguin);
		
		dataManager.print();
		
		System.out.println("penguin is removing");
//		dataManager.remove(penguin);
		dataManager.print();
		System.out.println("Printing flyable birds");
		dataManager.printFlyable();
	}

}
