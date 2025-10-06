package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);	
		
		System.out.print("Input a value:");
		int n = kb.nextInt();	
	
		for (int i = 0; i < n; ++i);
			System.out.printf("%d ", i);
		
		System.out.println();
	}
}