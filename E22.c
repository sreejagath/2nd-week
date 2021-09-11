#include<stdio.h>
void main() {
    int l,q,m,i,j,n=5,count=2;
    for(i=0;i<n;i++) {
        for(j=0;j<i;j++) {
        if(j%2!=0){
            printf("_ ");
        }
        }printf("\n");
    }
}