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

```