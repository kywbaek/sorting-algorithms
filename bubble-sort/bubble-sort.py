def bubbleSort(arr):
    for end in xrange(len(arr) - 1, 0, -1):
        swap = 0
        for i in xrange(end):
            if a[i] > a[i + 1]:
                a[i], a[i + 1] = a[i + 1], a[i]
                swap += 1
        if swap == 0:
            break
    return arr


arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [3]

# Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
print bubbleSort(arr1)

# Expected result: []
print bubbleSort(arr2)

# Expected result: [3]
print bubbleSort(arr3)
