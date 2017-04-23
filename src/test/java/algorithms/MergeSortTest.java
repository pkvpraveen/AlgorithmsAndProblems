package algorithms;

import algorithms.MergeSort;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();
    private Random random = new Random();

    @Test
    public void shouldReturnArrayIfEmpty() {
        int[] array = {};
        int[] result = mergeSort.mergeSort(array);
        assertEquals(0, result.length);
    }

    @Test
    public void shouldSortArray() {
        for (int i = 0; i < 1000; i++) {
            int[] array = randomArray();
            int[] expectedArray = array.clone();

            int[] sortedArray = mergeSort.mergeSort(array);

            Arrays.sort(expectedArray);
            for (int j = 0; j < expectedArray.length; j++) {
                assertEquals(expectedArray[j], sortedArray[j]);
            }
        }
    }

    private int[] randomArray() {
        int randomIntLessThanNine = (int) (Math.random() * 20 + 1);
        int[] array = new int[randomIntLessThanNine];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

}