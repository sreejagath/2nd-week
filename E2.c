#include<stdio.h>

void main(){
    int i,j,arr[50],n,count=1;
    printf("Enter the limit : ");
    scanf("%d",&n);
    printf("Enter the elements : ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        count=1;
        }for(i=0;i<n;i++){
            printf("%d  %d \n",arr[i],count);
        }
        
    }

}