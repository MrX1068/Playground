#include <stdio.h>
int main() {
	// Type your code here
  int n;
  int num = 1;
  scanf("%d",&n);
  for(int cur_row = 1;cur_row <= n;cur_row++)
  {
    for(int space = 1;space <= n - cur_row;space++)
    {
      printf(" ");
    }
    for(int cur_col = 1;cur_col <= cur_row;cur_col++)
    {
      printf("%d ", num );
      num += 1;
    }
 
    printf("\n");
  }
	return 0;
}