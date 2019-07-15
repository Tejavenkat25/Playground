#include<stdio.h>
int main()
{
  int n,first,third,sum;
  scanf("%d",&n);
  first=n/100;
  third=n%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}