def quickSort(array):
    if len(array) <= 1:
        return array
    pivot = array[-1]
    pivot_index = len(array) - 1
    check_index = 0
    while check_index < pivot_index:
        if array[check_index] > pivot:
            array[pivot_index] = array[check_index]
            array[check_index] = array[pivot_index - 1]
            array[pivot_index - 1] = pivot
            pivot_index -= 1
        else:
            check_index += 1
    return quickSort(array[:pivot_index]) + [pivot] + quickSort(array[(pivot_index + 1):])


arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [7, 5]

# Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
print quickSort(arr1)

# Expected result: []
print quickSort(arr2)

# Expected result: [5, 7]
print quickSort(arr3)
