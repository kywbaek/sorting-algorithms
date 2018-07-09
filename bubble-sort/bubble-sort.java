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
    int[] output;

    int[] arr1 = {21, 4, 1, 3, 9, 20, 25, 6, 21, 14};
    output = bubbleSort(arr1);
    // Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
    for (int i: output) {
      System.out.print(i+" ");
    }

    int[] arr2 = {};
    output = bubbleSort(arr2);
    // Expected result: []
    System.out.println("");
    for (int i: output) {
      System.out.print(i+" ");
    }

    int[] arr3 = {3};
    output = bubbleSort(arr3);
    // Expected result: [3]
    System.out.println("");
    for (int i: output) {
      System.out.print(i+" ");
    }
  }
}
