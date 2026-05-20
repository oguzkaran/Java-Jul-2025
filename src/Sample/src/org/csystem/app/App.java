package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        String s = "Bugün hava [çok] güzel. Bu [güzel] havada denize mi gitsek?";
        String [] str = s.split("[ \\]\\[.]+");

        for (int i = 0; i < str.length; ++i)
            System.out.println(str[i]);
    }
}
