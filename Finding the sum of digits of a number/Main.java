#include <stdio.h>
int main() {
	//Type your code
  int n,ans;
  int sum = 0;
  scanf("%d",&n);
  while(n > 0)
  {
    ans = n % 10;
    sum = sum + ans;
    n = n / 10;
  }
  printf("%d",sum);
	return 0;
}