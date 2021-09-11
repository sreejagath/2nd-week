#include<stdio.h>
void main(){
    int i,j,n=5,index=-1;
    
    int count = 0;
    for(i=0;i<n;i++){
        
            printf("X ");
            count++;
        
    }
    printf("\n");
    int p=count;
    for(i=0;i<count;i++){
        for(j=2;j>0;j--){
            for(int k=0;k<j;k++){
                printf("-");
            }for(int l=0;l<p;l++){
                printf("X");
            }
            printf("\n");

        }
        p--;
        int q=4;
        for(int m=1;m<=q;m++){
            {
                printf("X");
            }
        }printf("\n");
    }
}
