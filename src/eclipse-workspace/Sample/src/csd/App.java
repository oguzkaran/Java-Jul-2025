package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input two value:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		CONTINUE_LOOP:
		for (int i = a; i <= b; ++i)
			for (int k = 2 * a; k <= 3 * b; ++k) {
				System.out.printf("(%d, %d)%n", i, k);
				
				if ((i + k) % 7 == 0)
					continue CONTINUE_LOOP;
			
			}
			
		System.out.println();
	}
}

