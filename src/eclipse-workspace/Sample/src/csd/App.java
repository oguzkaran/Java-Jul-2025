package csd;

class App {
	public static void main(String[] args) 
	{
		NumberUtilIsArmstronTest.run();
	}
}

class NumberUtilIsArmstronTest {
	public static void run()
	{
		int a = -10;
		
		while (a <= 999_999) {
			if (NumberUtil.isArmstrong(a))
				System.out.println(a);
			
			++a;
		}
	}
}

class NumberUtil {
	public static boolean isArmstrong(int a)
	{
		return a >= 0 && getDigitsPowSum(a) == a;
	}
	
	public static int getDigitsPowSum(int a)
	{
		int n = countDigits(a);
		
		int total = 0;
		
		while (a != 0) {
			total += Math.pow(a % 10, n);
			a /= 10;
		}
		
		return total;
	}
	
	public static int countDigits(int a)
	{
		if (a == 0)
			return 1;
		
		return (int)Math.log10(Math.abs(a)) + 1;
	}	
}