public class MergeSort {
    int[] mergeSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int initialIndex, int lastIndex) {
        if (initialIndex == lastIndex) {
            return array;
        }
        int divisionPoint = (initialIndex + lastIndex) / 2;
        sort(array, initialIndex, divisionPoint);
        sort(array, divisionPoint + 1, lastIndex);
        return merge(array, initialIndex, divisionPoint, lastIndex);
    }

    private int[] merge(int[] array, int initialIndex, int divisionPoint, int lastIndex) {
        int start = initialIndex;
        int middle = divisionPoint + 1;
        int[] result = new int[lastIndex - initialIndex + 1];
        for (int i = 0; i < result.length; i++) {
            if (start <= divisionPoint && middle <= lastIndex) {
                int min = Math.min(array[start], array[middle]);
                result[i] = min;
                if (min == array[start]) {
                    start++;
                } else {
                    middle++;
                }
            } else if (start > divisionPoint) {
                result[i] = array[middle];
                middle++;
            } else if (middle > lastIndex) {
                result[i] = array[start];
                start++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            array[initialIndex++] = result[i];

        }
        return array;
    }
}
