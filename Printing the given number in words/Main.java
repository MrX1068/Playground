#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  switch(n)
  {
    case 1:
      printf("One");
      break;
    case 2:
      printf("Two");
      break;
    case 3:
      printf("Three");
      break;
    default:
      printf("Invalid");
  }  
  }