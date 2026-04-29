package org.csystem.app.date;

public class DateUtil {
	public static int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public static String [] months = {"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"};

	public static void printDateEN(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);

		System.out.println(dayOfWeek != -1 ? "%d%s %s %d %s".formatted(day, getDaySuffix(day), months[month - 1], year, weekDays[dayOfWeek]) : "Invalid date values!...");
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		int totalDays;
		
		if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == -1)
			return -1;
		
		for (int y = 1900; y < year; ++y) {
			totalDays += 365;
			if (isLeapYear(y))
				++totalDays;
		}
		
		return totalDays % 7;				
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (isValidDate(day, month, year))
			return getDayOfYearValue(day, month, year);
		
		return -1;
	}
	
	public static int getDayOfYearValue(int day, int month, int year)
	{
		int dayOfYear = day;

		for (int m = month - 1; m >= 1; --m)
			dayOfYear += getMonthDays(m, year);

		return dayOfYear;
	}

	public static String getDaySuffix(int day)
	{
		return switch (day) {
			case 1, 21, 31 -> "st";
			case 2, 22 -> "nd";
			case 3, 23 -> "rd";
			default -> "th";
		};
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getMonthDays(month, year);
	}
	
	public static int getMonthDays(int month, int year)
	{
		return month == 2 && isLeapYear(year) ? 29 : monthDays[month - 1];
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}