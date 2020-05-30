#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int temp = n;
  for(int cur_row = 1;cur_row <= n;cur_row++)
  {
    for(int cur_col = temp;cur_col >= 1;cur_col--)
    {
      printf("%d",cur_col);
    }
   temp--;
   printf("\n");
  }
	return 0;
}