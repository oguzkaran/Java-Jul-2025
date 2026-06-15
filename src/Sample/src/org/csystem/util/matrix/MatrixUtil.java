package org.csystem.util.matrix;


/**
 * Utility class for Matrix operations
 * @author Java-Jul-2025 Group
 */
public class MatrixUtil {
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
}
