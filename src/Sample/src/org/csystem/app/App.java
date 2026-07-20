package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        for (int [] array : a) {
            for (int v : array)
                System.out.printf("%02d ", v);

            System.out.println();
        }

        System.out.println();
    }
}
