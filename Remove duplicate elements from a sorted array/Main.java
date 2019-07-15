#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int ele=-1,c=0;
  for(int i=0;i<n;i++)
  {
    if(ele==a[i])
    {
      for(int j=i;j<n;j++)
      {
        a[j]=a[j+1];
       
      }
      n--;
    }
    ele=a[i];
    
  }
   for(int i=0;i<n;i++)
    printf("%d ",a[i]);
  return 0;
}