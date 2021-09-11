import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
    String str = new String();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    str = sc.nextLine();
    int len=str.length();
    for(int i=0;i<len;i++){
        for(int j=i+1;j<=len;j++){
            System.out.println(str.substring(i,j));
        }
    }
}   
}
