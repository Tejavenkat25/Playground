#include<stdio.h>
int main()
{
 int n,a,s,sum;
  scanf("%d",&n);
  a=n/10;
  s=n%10;
  sum=a+s;
  printf("%d",sum);
  return 0;
}