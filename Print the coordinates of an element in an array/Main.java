#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d %d",&m,&n);
  int arr[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      scanf("%d",&arr[i][j]);
  }
  int key;
  scanf("%d",&key);
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      if(arr[i][j]==key)
      {
        printf("(%d, %d)",i,j);
        return 0;
      }
  }
  printf("(-1, -1)");
  return 0;
}