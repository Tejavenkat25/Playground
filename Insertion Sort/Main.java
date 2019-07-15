#include <stdio.h>

int main()
{
   int n;
   scanf("%d",&n);
   
   int a[n];
   for(int i=0;i<n;i++)
   scanf("%d",&a[i]);
   for(int i=1;i<n;i++)
   {
       int d=i;
       while(d>0&&a[d]<a[d-1])
       {
           a[d]=(a[d]+a[d-1])-(a[d-1]=a[d]);
           d--;
       }
   }
    for(int i=0;i<n;i++)
     printf("%d\n",a[i]);

    return 0;
}
