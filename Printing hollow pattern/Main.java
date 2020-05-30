#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int cur_row = 1;cur_row <= n;cur_row++)
  {
    for(int cur_col = 1;cur_col <= n;cur_col++)
    {
      if(cur_row == 1 || cur_col == 1 || cur_row == n || cur_col == n)
      {
        printf("*");
      }
      else
      {
        printf(" ");
      }
    }
     printf("\n");
  }
	return 0;
}