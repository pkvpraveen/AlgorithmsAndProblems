package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalTriangleTest {

    @Test
    public void shouldGeneratePascalTriangle() {
        int[][] expected = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1}
        };
        long startTime = System.nanoTime();
        assertArrayEquals(expected, new PascalTriangle().getPascalTriangle(5));
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        long startTime1 = System.nanoTime();
        assertArrayEquals(expected, new PascalTriangle().pascalTriangleEfficientWay(5));
        long endTime1 = System.nanoTime();
        System.out.println(endTime1 - startTime1);

        prettyPrint(new PascalTriangle().pascalTriangleEfficientWay(5));
    }

    private void prettyPrint(int[][] pascalTriangle) {
        for (int i = 0; i < pascalTriangle.length; i++) {
            System.out.format("%" + (pascalTriangle.length - i) * 2 + "s", " ");
            for (int j = 0; j < pascalTriangle[i].length; j++) {

                System.out.format("%4d", pascalTriangle[i][j]);
            }
            System.out.println();
        }
    }
}