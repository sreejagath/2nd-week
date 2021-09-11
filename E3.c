#include<stdio.h>
void main(){
    int i,j,arr[50],n,temp;
    printf("Enter the limit : ");
    scanf("%d",&n);
    printf("Enter the elements : ");
    for (i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for (i=0;i<n;i++){
        for (j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    }
    printf("Second largest element of the array is : ");
    for(i=0;i<n;i++){
        if(arr[i]==arr[n-2]){
        printf("%d ",arr[i]);
    }
    }
}