function max_of_three(x, y, z) 
 {
  max_val = 0;
  if (x > y)
  {
    max_val = x;
  } else
  {
    max_val = y;
  }
  if (z > max_val) 
  {
    max_val = z;
  }
  return max_val;
}

console.log(max_of_three(1,0,5));
console.log(max_of_three(0,-100,-25));
console.log(max_of_three(100,510,440));