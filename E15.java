import java.util.Scanner;
public class E15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        int i,j,k;
        for(i=1;i<=rows;i++){
            for(j=i;j<rows;j++){
                System.out.print(" ");
            }
            int count = 1;
    for(k = 1; k < rows; k=k+2){
        System.out.print("* ");
        count++;
}System.out.println();
    }
}
}