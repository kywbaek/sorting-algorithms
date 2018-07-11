def insertionSort(arr):
    for i in xrange(1, len(arr)):
        j = i - 1
        elm = arr[i]
        while j >= 0 and arr[j] > elm:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = elm
    return arr


arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [7, 5]

# Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
print insertionSort(arr1)

# Expected result: []
print insertionSort(arr2)

# Expected result: [5, 7]
print insertionSort(arr3)
