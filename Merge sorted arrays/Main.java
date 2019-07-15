#include <stdio.h>
int main() 
{
	int m,n;
  scanf("%d %d",&m,&n);
  int mc=0,nc=0;
  int a[m],b[n],c[m+n];
  for(int i=0;i<m;i++)
    scanf("%d",&a[i]);
   for(int i=0;i<n;i++)
    scanf("%d",&b[i]);
  	int i=-1;
  for(;mc<m && nc<n;)
  {
    if(a[mc]>b[nc])
    {
      c[++i]=b[nc++];
    }
    else
      c[++i]=a[mc++];
  }
  while(mc<m)
    c[++i]=a[mc++];
  while(nc<n)
    c[++i]=b[nc++];
  for(int i=0;i<m+n;i++)
    printf("%d ",c[i]);
	return 0;
}