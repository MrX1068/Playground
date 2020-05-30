#include <stdio.h>
int main(){
	// Type your code here
  int n;
  int num = 0;
  scanf("%d",&n);
  for(int cur_row = 1;cur_row <= n;cur_row++)
  {
    for(int cur_col = 1;cur_col <= cur_row;cur_col++)
    {
      if(num == 0)
      {
        printf("*");
        num = 1;
      }
      else
      {
        printf("#");
        num = 0;
    }}
    
   printf("\n");
  }
  	return 0;
}