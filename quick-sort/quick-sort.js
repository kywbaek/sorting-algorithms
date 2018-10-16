function quickSort(arr){
    let n = arr.length
    if (n<=1) {
        return arr
    }
    let pivot = arr[n-1]
    let pivot_index = n-1
    let check_index = 0

    while(check_index<pivot_index) {
        if (arr[check_index]>pivot){
            arr[pivot_index] = arr[check_index]
            arr[check_index] = arr[pivot_index-1]
            arr[pivot_index-1] = pivot
            pivot_index--
        } else {
            check_index++
        }
    }
    return quickSort(arr.slice(0,pivot_index)).concat([pivot]).concat(quickSort(arr.slice(pivot_index+1)))
}


arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [7, 5]

// Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
console.log(quickSort(arr1))

// Expected result: []
console.log(quickSort(arr2))

// Expected result: [5, 7]
console.log(quickSort(arr3))
