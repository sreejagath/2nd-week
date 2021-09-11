import java.util.Scanner;
public class E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[50];
        System.out.println("Enter the limit of the array : ");
        int limit = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i=0;i<limit;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<limit-1;i++){
            for(int j=i+1;j<limit;j++){
            if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            }
        }
        smallest(arr,limit);
        largest(arr,limit);
        sum(arr,limit);
        display(arr,limit);
    }
    static void smallest(int[] arr, int limit){
        for(int i=0;i<limit;i++){
            if(arr[i]==arr[0]){
                System.out.println("Smallest element is : "+arr[i]);
            
            }
        }
    }
    static void largest(int[] arr, int limit){
        for(int i=0;i<limit;i++){
            if(arr[i]==arr[limit-1]){
                System.out.println("Largest element is : "+arr[i]);
            
            }
        }
    }
    static void sum(int[] arr, int limit){
        int sum = 0;
        for(int i=0;i<limit;i++){
                sum = sum + arr[i];
        }
        System.out.println("The sum of the array is : "+sum);
    }
    static void display(int[] arr, int limit){
        System.out.print("Array : ");
        for(int i=0;i<limit;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
