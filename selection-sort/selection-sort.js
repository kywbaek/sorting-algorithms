function selectionSort(arr){
    let n = arr.length
    for (let i=0;i<n-1;i++) {
        let minIndex = i
        for (let j=i+1;j<n;j++) {
            if (arr[j]<arr[minIndex]) {
                minIndex = j
            }
        }
        if (minIndex!=i) {
            let temp = arr[minIndex]
            arr[minIndex] = arr[i]
            arr[i] = temp
        }
    }
    return arr
}


let arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
let arr2 = []
let arr3 = [7, 5]

// Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
console.log(selectionSort(arr1))

// Expected result: []
console.log(selectionSort(arr2))

// Expected result: [5, 7]
console.log(selectionSort(arr3))
