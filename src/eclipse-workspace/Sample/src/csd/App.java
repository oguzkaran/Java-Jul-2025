package csd;

class App {
	public static void main(String[] args) 
	{
		DemoSpaceWarApp.run();
	}
}

class DemoSpaceWarApp {
	public static void run()
	{
		//...
		
		for (int i = 0; i < 30; ++i) {
			Alien alien = new Alien();
			
			//...
		}
		
		for (int i = 0; i < 40; ++i) {
			Soldier soldier = new Soldier();
			
			//...
		}
		
		System.out.printf("Number of aliens:%d%n", Alien.count);
		System.out.printf("Number of soldiers:%d%n", Soldier.count);
		//...
	}
}


class Alien {
	public static int count;
	public int headsCount;
	public int armsCount;
	//...
	
	public Alien() //**
	{
		++count;
	}
}

class Soldier {
	public static int count;
	public int title;
	public int gunCount;
	
	public Soldier() //***
	{
		++count;
	}
	//...
}

class Civilian {
	//...
}

class Animal {
	//...
}

class Building {
	//...
}

class Tree {
	//...
}