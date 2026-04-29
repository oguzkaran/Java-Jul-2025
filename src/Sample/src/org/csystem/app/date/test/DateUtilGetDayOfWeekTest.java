package org.csystem.app.date.test;

import org.csystem.app.date.DateUtil;

import java.util.Scanner;

public class DateUtilGetDayOfWeekTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("Input day, month and year:");
			int day = kb.nextInt();
			int month = kb.nextInt();
			int year = kb.nextInt();
			
			if (day == 0 && month == 0 && year == 0)
				break;
			
			DateUtil.printDateEN(day, month, year);
		}
	}

	public static void main()
	{
		run();
	}
}


