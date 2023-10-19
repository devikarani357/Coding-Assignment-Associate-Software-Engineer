const arr = [5, 2, 9, 1, 5, 6];

function sorting(arr) {
  return arr.sort((a, b) => b - a);
}


const sortedArrDesc = sorting(arr);
console.log(sortedArrDesc); 