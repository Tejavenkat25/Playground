#include<stdio.h>
int main()
{
  int l=6,b=9,peri,area;
  area=l*b;
  peri=2*(l+b);
  printf("The perimeter of the rectangle is: %d cm\n",peri);
  printf("The area of the rectangle is: %d sq cm",area);
  return 0;
}