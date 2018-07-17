class InsertionSort {
    static int[] insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int j = i - 1;
            int elm = arr[i];
            while (j>=0 && arr[j]>elm) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = elm;
        }
        return arr;
    }

    public static void main(STring[] args) {
        int[] arr1 = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
        int[] arr2 = {};
        int[] arr3 = {7, 5};

        // Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
        System.out.println(insertionSort(arr1));

        // Expected result: []
        System.out.println(insertionSort(arr2));

        // Expected result: [5, 7]
        System.out.println(insertionSort(arr3));
    }
}
