package problems;

public class PascalTriangle {

    public int[][] getPascalTriangle(int depth) {
        int[][] pascalTriangle = new int[depth][];
        if (depth == 0) {
            return pascalTriangle;
        }
        for (int currentDepth = 0; currentDepth < depth; currentDepth++) {
            pascalTriangle[currentDepth] = new int[currentDepth + 1];
            for (int i = 0; i < currentDepth + 1; i++) {
                if (i == 0 || i == currentDepth) {
                    pascalTriangle[currentDepth][i] = 1;
                } else {
                    pascalTriangle[currentDepth][i] = pascalTriangle[currentDepth - 1][i - 1]
                            + pascalTriangle[currentDepth - 1][i];
                }
            }
        }
        return pascalTriangle;
    }

    public int[][] pascalTriangleEfficientWay(int depth) {
        int[][] pascalTriangle = new int[depth][];
        int i, number = 1, j;

        for (i = 0; i < depth; i++) {
            number = 1;
            pascalTriangle[i] = new int[i + 1];
            for (j = 0; j <= i; j++) {
                pascalTriangle[i][j] = number;
                number = number * (i - j) / (j + 1);
            }
        }
        return pascalTriangle;
    }
}
