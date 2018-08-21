import java.util.*;

class SelectionSort {
    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex!=i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
        int[] arr2 = {};
        int[] arr3 = {7, 5};

        // Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
        System.out.println(Arrays.toString(selectionSort(arr1)));

        // Expected result: []
        System.out.println(Arrays.toString(selectionSort(arr2)));

        // Expected result: [5, 7]
        System.out.println(Arrays.toString(selectionSort(arr3)));
    }
}
