function insertionSort(arr) {
    for (let i=1; i<arr.length; i++) {
        let j = i-1
        let elm = arr[i]
        while (j>=0 && arr[j]>elm) {
            arr[j+1] = arr[j]
            j--
        }
        arr[j+1] = elm
    }
    return arr
}

arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
arr2 = []
arr3 = [7, 5]

// Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
console.log(insertionSort(arr1))

// Expected result: []
console.log(insertionSort(arr2))

// Expected result: [5, 7]
console.log(insertionSort(arr3))
