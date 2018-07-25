def selectionSort(arr):
    n = len(arr)
    for i in xrange(n - 1):
        minIndex = i
        for j in xrange(i + 1, n):
            if arr[j] < arr[minIndex]:
                minIndex = j
        if minIndex != i:
            arr[minIndex], arr[i] = arr[i], arr[minIndex]
    return arr


arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [7, 5]

# Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
print selectionSort(arr1)

# Expected result: []
print selectionSort(arr2)

# Expected result: [5, 7]
print selectionSort(arr3)
