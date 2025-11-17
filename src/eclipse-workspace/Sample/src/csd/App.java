package csd;

class App {
    public static void main(String[] args)
    {
    	char c = '\uFFE3';
    	byte a;
    	
    	a = (byte)c;
    	
    	System.out.printf("c = %c, c = %d, c = %04X%n", c, (int)c, (int)c);
    	System.out.printf("a = %d, a = %02X%n", a, a);
    }
}