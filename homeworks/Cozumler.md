### C ve Sistem Programcıları Derneği
### Java ile Nesne Yönelimli Programlama
### Çalışma Soruları Çözümleri
### Eğitmen: Oğuz KARAN

#### Homework-001

>1. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		PrintRelationsApp.run();
	}
}

class PrintRelationsApp {
	public static void printRelations(int a, int b, int c)
	{
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int mid = a + b + c - min - max;
		
		if (min < mid)
			System.out.printf("%d < %d ", min, mid);
		else
			System.out.printf("%d = %d ", min, mid);
		
		if (mid < max)
			System.out.printf("< %d%n", max);
		else
			System.out.printf("= %d%n", max);
	}
	
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input three numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		printRelations(a, b, c);
	}
}
```

>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		NumberUtilMidTest.run();
	}
}


class NumberUtilMidTest {	
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input three numbers:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		System.out.printf("mid(%d, %d, %d) = %d%n", a, b, c, NumberUtil.mid(a, b, c));
	}
}


class NumberUtil {
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
}
```

>3. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		NumberUtilMidTest.run();
	}
}


class NumberUtilMidTest {	
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a number:");
		int a = kb.nextInt();
		
		System.out.printf("signum(%d) = %d%n", a, NumberUtil.signum(a));
	}
}


class NumberUtil {
	public static int signum(int a)
	{
		if (a > 0)
			return 1;
		
		if (a == 0)
			return 0;
		
		return -1;
	}
}
```

>3. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.
```java
package csd;

class App {
	public static void main(String[] args) 
	{
		NumberUtilMidTest.run();
	}
}


class NumberUtilMidTest {	
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input a number:");
		int a = kb.nextInt();
		
		System.out.printf("signum(%d) = %d%n", a, NumberUtil.signum(a));
	}
}


class NumberUtil {
	public static int signum(int a)
	{
		int result = -1;
		
		if (a > 0)
			result = 1;
		else if (a == 0)
			result = 0;
		
		return result;
	}
}
```

#### Homework-002

>1. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		WriteDiamondApp.run();
	}
}


class WriteDiamondApp {
	public static void writeAbove(int n)
	{
		for (int i = 1; i < n; ++i) {
			for (int k = 0; k < n - i; ++k)
				System.out.print(' ');
			
			for (int k = 0; k < 2 * i - 1; ++k)
				System.out.print('*');		
			
			System.out.println();
		}
	}
	
	public static void writeBelow(int n)
	{
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < i; ++k)
				System.out.print(' ');
			
			for (int k = 0; k < 2 * (n - i) - 1; ++k)
				System.out.print('*');		
			
			System.out.println();
		}
	}
	
	public static void writeDiamond(int n)
	{
		writeAbove(n);
		writeBelow(n);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		System.out.print("n değerini giriniz:");
		int n = kb.nextInt();
		
		writeDiamond(n);
	}
}
```

>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		DurationUtilPrintDurationTest.run();
	}
}


class DurationUtilPrintDurationTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		while (true) {
			System.out.print("Toplam saniye değerini giriniz:");
			long totalSeconds = kb.nextLong();
			
			DurationUtil.printDuration(totalSeconds);
			
			if (totalSeconds == 0)
				break;
		}
	}
}

class DurationUtil {
	public static void printDuration(long totalSeconds)
	{
		long hours = totalSeconds / 60 / 60;
		long minutes = totalSeconds / 60 % 60;
		long seconds = totalSeconds % 60;
		
		if (hours != 0)
			System.out.printf("%d saat ", hours);
		
		if (minutes != 0)
			System.out.printf("%d dakika ", minutes);
		
		if (seconds != 0)
			System.out.printf("%d saniye", seconds);
		
		
		System.out.println();
	}
}
```


>3. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		PrintPrimeFactorsApp.run();
	}
}


class PrintPrimeFactorsApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val <= 0)
				break;
			
			NumberUtil.printPrimeFactors(val);
		}
	}
}

class NumberUtil {
	public static void printPrimeFactors(int val)
	{
		int a = 2;
		
		while (val != 1) {
			if (val % a == 0) {
				System.out.printf("%d ", a);
				val /= a;
			} 
			else
				++a;
		}
		System.out.println();
	}
}
```

>4. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		BallFallApp.run();
	}
}


class BallFallApp {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
				
		System.out.print("Input width and height:");
		int width = kb.nextInt();
		int height = kb.nextInt();
		
		BallFall.play(width, height);
	}
}

class BallFall {
	public static void writeSpaces(int beginPos, int endPos)
	{
		for (int i = beginPos; i < endPos; ++i)
			System.out.print(' ');
	}
	
	public static int updateBallPos(int ballPos, boolean rightDir)
	{
		if (rightDir)
			return ballPos + 1;
		
		return ballPos - 1;
	}
	
	public static boolean updateRightDir(boolean rightDir, int ballPos, int width)
	{
		if (ballPos == 0)
			return true;
		
		if (ballPos == width - 1)
			return false;
		
		return rightDir;
	}
	
	public static void writeBall(int ballPos, int endPos)
	{
		writeSpaces(0, ballPos);
		System.out.print('*');
		writeSpaces(ballPos + 1, endPos);
	}
	
	public static void play(int width, int height)
	{
		int ballPos = 0;
		boolean rightDir = false;
		
		for (int i = 1; i <= height; ++i) {
			System.out.print('|');
			writeBall(ballPos, width);
			if (width != 1) {
				rightDir = updateRightDir(rightDir, ballPos, width);
				ballPos = updateBallPos(ballPos, rightDir);
			}
			System.out.println('|');
		}
	}
}
```

>5. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {

	public static void main(String[] args)
	{
		PrintGoldBachApp.run();
	}
	
}

class PrintGoldBachApp {	
	public static void run()
	{
        java.util.Scanner kb = new java.util.Scanner(System.in);
		
       
        while (true) {
	        System.out.print("2'den büyük çift bir sayı giriniz:");
	        int val = kb.nextInt();
	        
	        if (val == 0)
	        	break;
	        
	        if (val <= 2 || val % 2 != 0) {
	        	System.out.println("Geçersiz giriş -> 2'den büyük çift bir sayı girmelisiniz!...");
	        	continue;
	        }
	        
	        NumberUtil.printGoldBach(val);
	        
        }		
	}
}

class NumberUtil {
	public static void printGoldBach(int val)
	{
		for (int a = val - 1; a >= 2; --a) {
			int b = val - a;
			
			if (a >= b && isPrime(a) && isPrime(b))
				System.out.printf("%d + %d == %d%n", a, b, val);				
		}
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
```

#### Homework-003

>1. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args)
	{
		SatisfyConditionsApp.run();
	}	
}

class SatisfyConditionsApp {
	public static boolean isCondition1Satisfied(int a, int b, int c)
	{
		return (100 * c + 10 * b + a) > (100 * a + 10 * b + c);
	}
	
	public static boolean isCondition2Satisfied(int val)
	{
		return NumberUtil.isPrime(val);
	}
	
	
	public static boolean isCondition3Satisfied(int a, int b, int c)
	{
		return NumberUtil.isPrime(100 * c + 10 * b + a);
	}
	
	public static boolean isCondition4Satisfied(int a, int b)
	{
		return NumberUtil.isPrime(10 * a + b);
	}
	
	public static boolean isCondition5Satisfied(int b, int c)
	{
		return NumberUtil.isPrime(10 * b + c);
	}
	
	public static boolean isCondition6Satisfied(int c, int b)
	{
		return NumberUtil.isPrime(10 * c + b);
	}
	
	public static boolean isCondition7Satisfied(int b, int a)
	{
		return NumberUtil.isPrime(10 * b + a);
	}
	
	public static boolean isAllSatisfied(int val)
	{
		int a = val / 100;
		int b = val / 10 % 10;
		int c = val % 10;
		
		return isCondition1Satisfied(a, b, c) && isCondition2Satisfied(val) && isCondition3Satisfied(a, b, c)
				&& isCondition4Satisfied(a, b) && isCondition5Satisfied(b, c) && isCondition6Satisfied(c, b)
				&& isCondition7Satisfied(b, a);		
	}
	
	public static void run()
	{
		for (int val = 100; val <= 999; ++val)
			if (isAllSatisfied(val))
				System.out.printf("%d ", val);
		
		System.out.println();
	}
}

class NumberUtil {
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
```

>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args)
	{
		IsPrimeXTest.run();
	}	
}

class IsPrimeXTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input n:");
		long n = kb.nextLong();
		
		for (long a = 0; a <= n; ++a)
			if (NumberUtil.isPrimeX(a))
				System.out.println(a);
	}
}

class NumberUtil {
	public static boolean isPrimeX(long a) 
	{
		long sum = a;
		boolean result;
		
		while ((result = isPrime(sum)) && sum > 9)
			sum = sumDigits(sum);
	
		return result;	
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
	
	
	public static long sumDigits(long a)
	{
		long total = 0;
		
		while (a != 0) {
			total += a % 10;
			a /= 10;
		}
		
		return Math.abs(total);
	}
}
```





>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args)
	{
		IsPrimeXTest.run();
	}	
}

class IsPrimeXTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input n:");
		long n = kb.nextLong();
		
		for (long a = 0; a <= n; ++a)
			if (NumberUtil.isPrimeX(a))
				System.out.println(a);
	}
}

class NumberUtil {
	public static boolean isPrimeX(long a) 
	{	
		boolean result;
		
		for (long sum = a; (result = isPrime(sum)) && sum > 9; sum = sumDigits(sum))
			;
		
		return result;	
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
	
	
	public static long sumDigits(long a)
	{
		long total = 0;
		
		while (a != 0) {
			total += a % 10;
			a /= 10;
		}
		
		return Math.abs(total);
	}
}
```

>3. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args)
	{
		CalculateDigitalRootTest.run();
	}	
}

class CalculateDigitalRootTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input n:");
		int n = kb.nextInt();
		
		for (int a = 0; a <= n; ++a)
			System.out.printf("%d -> %d%n", a, NumberUtil.calculateDigitalRoot(a));
	}
}

class NumberUtil {
	public static int calculateDigitalRoot(int a) 
	{	
		int root = Math.abs(a);
		
		while (root > 9)
			root = sumDigits(root);
		
		return root;
	}
		

	public static int sumDigits(int a)
	{
		int total = 0;
		
		while (a != 0) {
			total += a % 10;
			a /= 10;
		}
		
		return Math.abs(total);
	}
}
```

>4. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args)
	{
		CalculateDigitalRootTest.run();
	}	
}

class CalculateDigitalRootTest {	
	public static void run()
	{
		for (int n = 0; n <= 100_000; ++n)
			if (NumberUtil.isFactorian(n))
				System.out.printf("%d ", n);
		
		System.out.println();
	}
}

class NumberUtil {
	public static boolean isFactorian(int n) 
	{	
		return n > 0 && sumFactorialDigits(n) == n;
	}
	
	public static int sumFactorialDigits(int n)
	{
		int total = 0;
		
		while (n != 0) {
			total += factorial(n % 10);
			n /= 10;
		}
		
		return total;
	}
		

	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
}
```

>5. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
    public static void main(String[] args)
    {
    	NumberUtilIsSuperPrimeTest.run();
    }
}


class NumberUtilIsSuperPrimeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input n:");
		long n = kb.nextLong();
		
		for (long i = 0; i <= n; ++i)
			if (NumberUtil.isSuperPrime(i))
				System.out.printf("%d ", i);
		
		System.out.println();
	}
}

class NumberUtil {
	public static boolean isSuperPrime(long a)
	{
		return isPrime(a) && isPrime(indexOfPrime(a));
	}
	
	public static int indexOfPrime(long a)
	{
		int i = 1;
		long val = 2;
		
		while (true) {
			if (val == a)
				return i;
			
			if (isPrime(val))
				++i;
			
			++val;
		}	
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

```

>6. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
    public static void main(String[] args)
    {
    	FindHardyRamanujanNumbersApp.run();
    }
}

class FindHardyRamanujanNumbersApp {
	public static void run()
	{
		for (int n = 1; n < 100_000; ++n)
			if (NumberUtil.isHardyRamanujan(n))
				System.out.printf("%d ", n);
		
		System.out.println();
	}
}

class NumberUtil {
	public static boolean isHardyRamanujan(int n)
	{
		return n > 0 && countHardyRamanujanPairs(n) == 2;
	}
	
	public static int countHardyRamanujanPairs(int n)
	{
		int count = 0;
		
		EXIT_LOOP:
		for (int a = 1; a * a * a < n; ++a)
			for (int b = a + 1; a * a * a + b * b * b <= n; ++b) {
				if (a * a * a + b * b * b == n) {
					if (++count == 2)
						break EXIT_LOOP;
					
					++b;
				}
			}
		
		return count;
	}
}
```

>7. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
    public static void main(String[] args)
    {
    	NumberUtilIsDecimalHarshadTest.run();
    }
}

class NumberUtilIsDecimalHarshadTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Input n:");
		int n = kb.nextInt();
		
		for (int i = 0; i <= n; ++i)
			if (NumberUtil.isDecimalHarshad(i))
				System.out.printf("%d%n", i);
	}
}

class NumberUtil {
	public static boolean isDecimalHarshad(int a)
	{
		return a > 0 && a % sumDigits(a) == 0;
	}
	
	public static int sumDigits(int a)
	{
		int total = 0;
		
		while (a != 0) {
			total += a % 10;
			a /= 10;
		}
		
		return Math.abs(total);
	}
}
```

>8. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
    public static void main(String[] args)
    {
    	NumberUtilPrintCollatztest.run();
    }
}

class NumberUtilPrintCollatztest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Input a value:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n == 0)
				break;
			
			System.out.println("-----------------------------------------");
			NumberUtil.printCollatz(n);
			System.out.println("-----------------------------------------");
		}
	}
}

class NumberUtil {
	public static void printCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Invalid numbers");
			return;
		}
		
		System.out.println(n);
		
		while (n != 1) {
			if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
			
			System.out.println(n);
		}			
	}
}
```

#### Homework-004

>Sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.
>
>**Açıklama*:* Sorudan birden fazla Scanner nesnesi yaratılmaması için döngü içerisi metotlara bölmeden yazılmıştır. Sorunun verildiği tarihte referans parametreli metotlar henüz anlatılmadığından bu şekilde yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		CalculateMinMaxAverageApp.run();
	}
}


class CalculateMinMaxAverageApp {
	public static void printReport(int count, int total, int min, int max)
	{	
		System.out.printf("Toplam %d değer girildi.%n", count);
		System.out.printf("Maksimum = %d%n", max);
		System.out.printf("Minimum = %d%n", min);
		System.out.printf("Ortalama = %.6f%n", (double)total / count);
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int count = 0;
		int total = 0;
		int min = 100;
		int max = 0;
		
		while (true) {
			int val;
			
			while (true) {
				System.out.print("Bir tamsayı giriniz:");
				val = Integer.parseInt(kb.nextLine());
				
				if (0 <= val && val <= 100)
					break;
				
				System.out.print("Geçersiz değer girdiniz!...Yeni bir değer giriniz:");
			}
			
			++count;
			total += val;
			min = Math.min(min, val);
			max = Math.max(max, val);
			
			System.out.print("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
			int option;
			
			do 
				option = Integer.parseInt(kb.nextLine());
			while (option != 0 && option != 1);
			
			if (option == 0)
				break;			
		}		
		printReport(count, total, min, max);
	}
}
```

#### Homework-005

>1. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		FindEulerNumberViaSeriesApp.run();
	}
}

class FindEulerNumberViaSeriesApp {
	public static void run()
	{
		System.out.println(Util.e());
		System.out.println(Math.abs(Util.e() - Math.E) < 0.0000001);
	}
}

class Util {
	public static double e()
	{
		double result = 2;
		
		for (int i = 2; i <= 10; ++i)
			result += 1. / NumberUtil.factorial(i);
		
		return result;
	}
}


class NumberUtil {
	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;		
		
		return result;
	}
}
```

>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.
>
>**Açıklama:** Bu çözüm çok büyük sayılar söz konusu olduğunda ve dolayısıyla metodun long parametreli olanı da yazıldığında performansı olumsuz etkiler. Bu durumda bir sonraki çözm tercih edilebilir.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		SumFactorsTest.run();
	}
}

class SumFactorsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			if (a == 0)
				break;
			
			System.out.printf("%d sayısının kendisi hariç çarpanları toplamı:%d%n", a, NumberUtil.sumFactors(a));
		}
	}
}

class NumberUtil {
	public static int sumFactors(int a)
	{
		int result = 1;
		
		for (int i =  2; i <= a / 2; ++i)
			result += a % i == 0 ? i : 0;
		
		return result;
	}
}
```

>2. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		SumFactorsTest.run();
	}
}

class SumFactorsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		while (true) {
			System.out.print("Bir sayı giriniz:");
			long a = Long.parseLong(kb.nextLine());
			
			if (a == 0)
				break;
			
			System.out.printf("%d sayısının kendisi hariç çarpanları toplamı:%d%n", a, NumberUtil.sumFactors(a));
		}
	}
}

class NumberUtil {
	public static long sumFactors(long a)
	{
		long result = 1;
		
		for (int i =  2; i * i <= a; ++i) 
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);
		
		return result;
	}
}
```

>3. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		AreFriendsTest.run();
	}
}

class AreFriendsTest {
	public static void run()
	{
		AreFriends2DigitsTest.run();
		AreFriends3DigitsTest.run();
		AreFriends4DigitsTest.run();
	}
}

class AreFriends2DigitsTest {
	public static void run()
	{
		System.out.println("2 basamaklı arkadaş sayılar:");
		for (int a = 10; a <= 99; ++a)
			for (int b = a + 1; b <= 99; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
	}
}

class AreFriends3DigitsTest {
	public static void run()
	{
		System.out.println("3 basamaklı arkadaş sayılar:");
		for (int a = 100; a <= 999; ++a)
			for (int b = a + 1; b <= 999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
	}
}

class AreFriends4DigitsTest {
	public static void run()
	{
		System.out.println("4 basamaklı arkadaş sayılar:");
		for (int a = 1000; a <= 9999; ++a)
			for (int b = a + 1; b <= 9999; ++b)
				if (NumberUtil.areFriends(a, b))
					System.out.printf("(%d, %d)%n", a, b);
	}
}

class NumberUtil {
	public static boolean areFriends(int a, int b)
	{
		return sumFactors(a) == b && sumFactors(b) == a;
	}
	
	public static long sumFactors(long a)
	{
		long result = 1;
		
		for (int i =  2; i * i <= a; ++i) 
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);
		
		return result;
	}
}
```


>4. sorunun bir çözümü
>
>**Not:** Çözüm, çalışma sorusunun verildiği tarihe kadar işlenmiş olan konular kullanılarak yazılmıştır.

```java
package csd;

class App {
	public static void main(String[] args) 
	{
		IsPerfectTest.run();
	}
}

class IsPerfectTest {
	public static void run()
	{
		IsPerfect1DigitsTest.run();
		IsPerfect2DigitsTest.run();
		IsPerfect3DigitsTest.run();
		IsPerfect4DigitsTest.run();
	}
}

class IsPerfect1DigitsTest {
	public static void run()
	{
		System.out.print("1 basamaklı mükemmel sayılar:");
		for (int a = 1; a <= 9; ++a)
			if (NumberUtil.isPerfect(a))
				System.out.printf("%d ", a);
		System.out.println();		
	}
}

class IsPerfect2DigitsTest {
	public static void run()
	{
		System.out.print("2 basamaklı mükemmel sayılar:");
		for (int a = 10; a <= 99; ++a)
			if (NumberUtil.isPerfect(a))
				System.out.printf("%d ", a);
		System.out.println();		
	}
}

class IsPerfect3DigitsTest {
	public static void run()
	{
		System.out.print("3 basamaklı mükemmel sayılar:");
		for (int a = 100; a <= 999; ++a)
			if (NumberUtil.isPerfect(a))
				System.out.printf("%d ", a);
		
		System.out.println();
	}
}

class IsPerfect4DigitsTest {
	public static void run()
	{
		System.out.print("4 basamaklı mükemmel sayılar:");
		for (int a = 1000; a <= 9999; ++a)
			if (NumberUtil.isPerfect(a))
				System.out.printf("%d ", a);
		
		System.out.println();
	}
}

class NumberUtil {
	public static boolean isPerfect(int a)
	{
		return sumFactors(a) == a;
	}
	
	public static long sumFactors(long a)
	{
		long result = 1;
		
		for (int i =  2; i * i <= a; ++i) 
			if (a % i == 0)
				result += (i == a / i) ? i : (i + a / i);
		
		return result;
	}
}
```


