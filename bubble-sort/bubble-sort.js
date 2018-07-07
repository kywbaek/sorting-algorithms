function bubbleSort(arr) {
    for (let end=arr.length-1; end>0; end--) {
        let swap = 0
        for (let i=0; i<end; i++) {
            if (arr[i] > arr[i+1]) {
                let temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                swap++
            }
        }
        if (swap == 0) {
            break
        }
    }
    return arr
}

let arr1 = [21, 4, 1, 3, 9, 20, 25, 6, 21, 14]
let arr2 = []
let arr3 = [3]

// Expected result: [1, 3, 4, 6, 9, 14, 20, 21, 21, 25]
console.log(bubbleSort(arr1))

// Expected result: []
console.log(print bubbleSort(arr2))

// Expected result: [3]
console.log(print bubbleSort(arr3))
