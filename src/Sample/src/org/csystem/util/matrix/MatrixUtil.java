package org.csystem.util.matrix;


/**
 * Utility class for Matrix operations
 * @author Java-Jul-2025 Group
 */
public class MatrixUtil {
    public static int [][] add(int [][] a, int[][] b)
    {
        int row = a.length;
        int col = a[0].length;
        int [][] r = new int[row][col];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                r[i][j] = a[i][j] + b[i][j];

        return r;
    }

    public static void addBy(int [][] a, int val)
    {
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                a[i][j] += val;
    }

    public static int [][] multiply(int [][] a, int[][] b)
    {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int [][] r = new int[m][p];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                for (int k = 0; k < p; ++k)
                    r[i][k] += a[i][j] * b[j][k];
        return r;
    }

    public static void multiplyBy(int [][] a, int val)
    {
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                a[i][j] *= val;
    }

    public static int [][] subtract(int [][] a, int[][] b)
    {
        int row = a.length;
        int col = a[0].length;
        int [][] r = new int[row][col];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                r[i][j] = a[i][j] - b[i][j];

        return r;
    }

    public static void subtractBy(int [][] a, int val)
    {
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                a[i][j] -= val;
    }

    public static boolean equals(int[][] a, int[][] b)
    {
        if (a.length != b.length || a[0].length != b[0].length)
            return false;

        int row =  a.length;
        int col = a[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                if (a[i][j] != b[i][j])
                    return false;
        return true;
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a[0].length == a.length;
    }

    public static long sumDiagonal(int[][] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }

    public static int [][] transpose(int [][] a)
    {
        int row = a.length;
        int col = a[0].length;
        int [][] r = new int[col][row];

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                r[j][i] = a[i][j];

        return r;
    }
}
