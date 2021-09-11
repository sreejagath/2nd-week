#include<stdio.h>
void main(){
    printf("Pattern 1 : \n\n\n");
    int i,j,c=2;
    for(i=1;i<=4;i++){
        c++;
        for(j=1;j<=i;j++){
            printf("%d",c);
            
        }
        printf("\n");
        
    }
    
    for(i=4;i>1;i--){
        c=c-1;
        for(j=1;j<=i-1;j++){
            printf("%d",c);
            
        }
        printf("\n");
    }

    printf("\n\n\n");
    printf("Pattern 2 : \n\n\n");
    for(i=1;i<=4;i++){
        
        for(j=2;j<=i;j++){
            printf("%d*",i);
        }
        printf("%d",i);
        printf("\n");
    }for(i=4;i>=1;i--){
        
        for(j=2;j<=i;j++){
            printf("%d*",i);
        }
        printf("%d",i);
        printf("\n");
    }   printf("\n");
    }


