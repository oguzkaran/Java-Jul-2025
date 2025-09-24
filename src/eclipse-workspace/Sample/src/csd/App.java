package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a value:");
		int a = kb.nextInt();
		
		if (a % 2 == 0)			
			a /= 2;
		
		System.out.printf("a = %d%n", a);
	}
}
