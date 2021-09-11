import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j=0,stat;
        int[] arr=new int[50];
         System.out.println("Enter the limit : ");
         int len=sc.nextInt();
         System.out.println("Enter the array : ");
         for(i=0;i<len;i++){
             arr[i]=sc.nextInt();
         }
         for(int m=0;m<len;m++){
             for(int l=m+1;l<len;l++){
                 if(arr[m]>arr[l]){
                 stat=arr[m];
                 arr[m]=arr[l];
                 arr[l]=stat;
                 }
             }
         }
        for(i=0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[len-1];
        for(int k=0;k<j;k++){
            System.out.print(" "+arr[k]);
        }
    }
}