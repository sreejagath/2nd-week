#include<stdio.h>
void main() {
    int i,j,n,flag=0;
    printf("Enter a limit : ");
    scanf("%d",&n);
    printf("Prime numbers upto %d are : ",n);
    for(i=1;i<=n;i++) {
        flag=0;
        for(j=1;j<=i;j++) {
            if(i%j==0) {
                flag=flag+1;
            }
        }
        if(flag==2) {
            printf("%d ",i);
        }
    }
}