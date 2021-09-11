#include<stdio.h>
void main() {
    int num1, num2, num3;
    printf("Enter 3 numbers : ");
    scanf("%d %d %d",&num1,&num2,&num3);
    (num1<num2&&num1<num3)?printf("%d is smallest among them.",num1):((num2<num3)?printf("%d is smallest among them.",num2):printf("%d is smallest among them.",num3));
}