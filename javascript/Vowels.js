function vowel_Count(str)
{ 

  return str.replace(/[^aeiou]/g, "").length; 
}

console.log(vowel_Count("Angelin"));
console.log(vowel_Count("Sukirtha"));