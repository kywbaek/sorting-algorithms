import java.util.*;

class BubbleSort {
  static int[] bubbleSort(int[] arr) {
    int swap, temp;
    for (int end=arr.length-1; end>0; end--) {
      swap = 0;
      for (int i=0; i<end; i++) {
        if (arr[i]>arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        break;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr1 = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
    int[] arr2 = {};
    int[] arr3 = {7, 5};

    // Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
    System.out.println(Arrays.toString(bubbleSort(arr1)));

    // Expected result: []
    System.out.println(Arrays.toString(bubbleSort(arr2)));

    // Expected result: [5, 7]
    System.out.println(Arrays.toString(bubbleSort(arr3)));
  }
}
