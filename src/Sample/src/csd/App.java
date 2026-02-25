package csd;

class App {
    public static void main(String[] args)
    {
    	StringUtilRepeatTest.run();
    }
}

class StringUtilRepeatTest {
	public static void run()
	{
		System.out.println(StringUtil.repeat(4, 'x'));
		System.out.println(StringUtil.repeat(5, 'c'));
	}
}

class StringUtil {
	public static String repeat(int n, char ch)
	{
		return String.format("%" + n + "c", ' ').replace(' ', ch);
	}
}