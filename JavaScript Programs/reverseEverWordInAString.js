let string=prompt("Enter the Name You want to Reverse:");

function reverse(sentence) {
  return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

const reversedSentence = reverse(string);
console.log(reversedSentence); 