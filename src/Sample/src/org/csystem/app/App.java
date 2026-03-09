package org.csystem.app;

class App { 
    public static void main(String [] args)
    {
        Sample s = new Sample();

        s.foo(30);

        System.out.printf("s.x = %d%n", s.x);
    }
}

class Sample {
    public int x;

    //...

    public void foo(int x) 
    {
        x = 10;   
    }
}
