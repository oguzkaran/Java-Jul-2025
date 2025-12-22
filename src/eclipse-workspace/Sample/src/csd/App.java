package csd;

class App {
	public static void main(String[] args) 
	{			
		Sample s1, s2;
		
		s1 = new Sample();
		s1.x = 10;
		s1.y = true;
		
		s2 = s1;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);		
		System.out.println("----------------------------------------------");
		
		++s1.x;
		s2.y = false;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);		
		System.out.println("----------------------------------------------");
		
		
		s1 = new Sample();
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);		
		System.out.println("----------------------------------------------");
		
		++s2.x;
		s2.y = true;
		
		System.out.printf("s1.x = %d, s1.y = %b%n", s1.x, s1.y);
		System.out.printf("s2.x = %d, s2.y = %b%n", s2.x, s2.y);		
		System.out.println("----------------------------------------------");		
	}
}


class Sample {
	public int x;
	public boolean y;
	
	//...
}

