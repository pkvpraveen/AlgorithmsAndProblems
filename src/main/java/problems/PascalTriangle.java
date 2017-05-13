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
                if (i == 0) {
                    pascalTriangle[currentDepth][0] = 1;
                } else if (i == currentDepth) {
                    pascalTriangle[currentDepth][currentDepth] = 1;
                } else {
                    pascalTriangle[currentDepth][i] = pascalTriangle[currentDepth - 1][i - 1]
                            + pascalTriangle[currentDepth - 1][i];
                }
            }
        }
        return pascalTriangle;
    }
}
