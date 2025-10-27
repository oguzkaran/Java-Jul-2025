package csd;

class App {
	public static void main(String[] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input code:");
		int code = kb.nextInt();
				
		switch (code) {
		case 212, 216 -> System.out.println("İstanbul");
		case 312 -> System.out.println("Ankara");
		case 232 -> System.out.println("İzmir");
		case 372 -> System.out.println("Zonguldak");
		default -> System.out.println("Invalid code value!...");
		}
		
		System.out.println("C and System Programmers Association");	
	}
}