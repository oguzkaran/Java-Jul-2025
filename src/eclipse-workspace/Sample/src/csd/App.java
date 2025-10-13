package csd;

class App {
	public static void main(String[] args) 
	{
		NumbeUtilFibonacciNumberTest.run();
	}
}


class NumbeUtilFibonacciNumberTest {
	public static void run()
	{	
		for (int n = 1; n <= 30; ++n)
			System.out.printf("%d ", NumberUtil.fibonacciNumber(n));
		
		System.out.println();
	}
}

class NumberUtil {
	public static int fibonacciNumber(int x)
	{
		if(x <= 2) {
			return x-1;
		}
		
		int sum = 0;
		for(int counter = 3, a1 = 0, a2 = 1 ; counter <= x ; counter++) {
			sum = a1 + a2;
			a1 = a2;
			a2 = sum;
		}
		
		return sum;

	}
	
}

