#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,last_digit,sum,ans = 0,temp;
  scanf("%d",&n);
  temp = n;
  while(n > 0)
  {
    last_digit = n % 10;
    sum = pow(last_digit,3);
    ans = ans + sum;
    n = n / 10;
  }
  if(ans == temp)
     printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
  return 0;
}