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

```

