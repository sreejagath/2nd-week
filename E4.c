#include<stdio.h>
void main(){
    int i,j=0,temp[20],arr[20],n,count=0,stat;
    printf("Enter the limit : ");
    scanf("%d",&n);
    printf("Enter the array : ");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
            stat=arr[i];
            arr[i]=arr[j];
            arr[j]=stat;
            }
        }
    }
    for(i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    for(i=0;i<n;i++){
        if(arr[i]!=arr[i+1]){
            temp[count++]=arr[i];
        }
    }
    for(i=0;i<n;i++){
        printf("%d",temp[i]);
    }
}