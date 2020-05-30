#include<stdio.h>
int main()
{
  //Type your code here
  int num,second_last_digit;
  scanf("%d",&num);
  second_last_digit = (num / 10) % 10;
  printf("%d",second_last_digit);
  return 0;
}