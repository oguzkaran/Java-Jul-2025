package msd;

public class Sample {
    //...
    public static int main(String [] args)
    {
        System.out.println("Sample.main");

        return 0;
    }

    public void foo()
    {
        Mample.bar();
        System.out.println("Sample.foo");
    }
}