#include<stdio.h>
int main()
{
  int did=365,dis=4,q,r;
  q=did/dis;
  r=did%dis;
  printf("Quotient: %d\nRemainder: %d",q,r);
  return 0;
}