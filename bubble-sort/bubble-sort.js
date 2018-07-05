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
