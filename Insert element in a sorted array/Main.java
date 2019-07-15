#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  int arr[n+1];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int ele;
  scanf("%d",&ele);
  for(int i=0;i<n;i++)
  {
    if(arr[i]>=ele)
    {
      for(int j=n;j>i;j--)
        arr[j]=arr[j-1];
         arr[i]=ele;
      break;
    }
    if(i==n-1)
      arr[i+1]=ele;
  }
   for(int i=0;i<n+1;i++)
    printf("%d ",arr[i]); 
    
  return 0;
}