#include<stdio.h>
void main() {
    char str[100];
    int i,j,count=0;
    printf("Enter a string : ");
    scanf("%s",str);
    for(i=0;str[i]!='\0';i++) {
        count++;
    }
    printf("%d\n",count);
    if(count%2==0){
        for(i=0;i<count;i++){
            for(j=0;j<count;j++){
                if(i==j||i+j==count-1){
                        printf("%c",str[i]);
                }else{
                    printf(" ");
                }
            }printf("\n");
        }
    }else{
        for(i=0;i<count;i++){
            for(j=0;j<count;j++){
                if(i==j||i+j==count-1){
                        printf("%c",str[i]);
                }else{
                    printf(" ");
                }
            }printf("\n");
        }
    }
}