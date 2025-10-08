package csd;

class App {
	public static void main(String[] args) 
	{
		NumberUtilIsPrimeTest.run();
	}
}

class NumberUtilIsPrimeTest {
	public static void run()
	{			
		System.out.println("isPrime:");
		System.out.println(NumberUtil.isPrime(710584055392819667L));		
	}
}

class NumberUtil {
	public static boolean isPrimeSlow(long a) 
	{
		if (a <= 1)
			return false;
		
		for (long i = 2; i <= a / 2; ++i)	
			if (a % i == 0)
				return false;
		
		return true;			 
	}
	
	
	public static boolean isPrime(long a) 
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0) 
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		
		return true;
	}
}