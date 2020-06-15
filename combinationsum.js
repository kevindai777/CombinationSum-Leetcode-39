//Objective is to find all UNIQUE sets of integers in a 1-D array that add up
//to a certain target value.

let candidates = [2,3,6,7]
let target = 7


//O()

let result = []
let arr = []
let sum = 0
let index = 0

backtrack(arr, sum, index)

//We want to keep track of the growing array, the growing sum, and the index
//of the array to make sure we don't have any repeats.
function backtrack(arr, sum, index) {
    if (sum > target) {
        return
    }

    if (sum == target) {
        result.push(arr)
    }

    for (let i = index; i < candidates.length; i++) {
        backtrack([...arr, candidates[i]], sum + candidates[i], i)
    }
}

return result