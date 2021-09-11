import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();
        System.out.print("Pattern 1\n");
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
            }System.out.println();
        }
        System.out.print("\nPattern 2\n");
        for (int i = row; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
            }System.out.println();
        }
        System.out.print("\nPattern 3\n");
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                if(j==1){
            System.out.print(j+" ");
                }
                else if(i==1||i==row||i==j){

            System.out.print(j+" ");

                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
        System.out.print("\nPattern 6\n");
        int i,j,count=1;
        for (i = row; i >=1; i--) {
            for (j = 1; j <=i; j++) {
                if(j==1){
                System.out.print(count+" ");
                count++;
            }else if(i==row){
                System.out.print(j+" ");
            }
            else if(i==j){
                System.out.print("5");
            }
            else{
                System.out.print("  ");
            }
        }System.out.println();
    }
    System.out.println("\nPattern 5\n");   
    for(i=1;i<=row;i++){
        for(j=i;j<row;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(" ");
            if(j==1||i==row||j==i){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
    
}    
}
