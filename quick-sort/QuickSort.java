import java.util.Arrays;

class QuickSort {
    static int[] quickSort(int[] arr) {
        int n = arr.length;
        if(n<=1) {
            return arr;
        }
        int pIndex = n-1;
        int pivot = arr[n-1];
        int checkIndex = 0;

        while(checkIndex<pIndex) {
            if(arr[checkIndex]>pivot) {
                arr[pIndex] = arr[checkIndex];
                arr[checkIndex] = arr[pIndex-1];
                arr[pIndex-1] = pivot;
                pIndex--;
            } else {
                checkIndex++;
            }
        }
        int [] result = new int [n];
        int i=0;
        for (int j:quickSort(Arrays.copyOfRange(arr,0,pIndex))){
            result[i++]=j;
        }
        result[i++]=pivot;
        for (int j:quickSort(Arrays.copyOfRange(arr,pIndex+1,n))){
            result[i++]=j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
        int[] arr2 = {};
        int[] arr3 = {7, 5};

        // Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
        System.out.println(Arrays.toString(quickSort(arr1)));

        // Expected result: []
        System.out.println(Arrays.toString(quickSort(arr2)));

        // Expected result: [5, 7]
        System.out.println(Arrays.toString(quickSort(arr3)));
    }
}

