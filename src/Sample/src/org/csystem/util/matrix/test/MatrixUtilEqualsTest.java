package org.csystem.util.matrix.test;

import org.csystem.util.matrix.MatrixUtil;

public class MatrixUtilEqualsTest {
    public static void run()
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int [][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int [][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, -9}, {10, 11, 12}};
        int [][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println(MatrixUtil.equals(a, b));
        System.out.println(!MatrixUtil.equals(c, d));
    }
    public static void main(String [] args)
    {
        run();
    }
}
