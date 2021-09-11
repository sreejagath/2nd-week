import java.util.Scanner;
public class E12
{
	public static void main(String arg[])	
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(num!=0)
        {
            sum = sum + num%10;
            product = product * (num%10);
            num = num/10;
        }
        System.out.println("Sum of digits of the number is : " + sum);
        System.out.println("Product of digits of the number is : " + product);
        if (sum == product){
            System.out.println("Sum and product of digits of the number is equal.");
        }
        else{
            System.out.println("Sum and product of digits of the number is not equal.");
        }
}
}