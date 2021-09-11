#include<stdio.h>
    void main(){
        int a;
        float b;
        printf("Enter a number: ");
        scanf("%d",&a);
        b=a/2;
        while(b*b!=a){
            b=(b+a/b)/2;
        }
        printf("The square root of %d is %f",a,b);
    }