
import java.util.*;
public class samp {
    /* Java program for diamond pattern printing using numbers and stars */






public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

int i,j,count=1,n; 

n = sc.nextInt();

for(i=1;i<=n;i++)

{

for(j=1;j<=i;j++)

{

if(j<i)

System.out.print(count++ + "*");

else

System.out.print(count++);

}

System.out.print("n");

}

count=count-n;

for(i=n;i>=1;i--)

{ for(j=1;j<=i;j++)

{

if(j<i)

System.out.print(count++ + "*");

else

System.out.print(count++);

}

count=(count+1)-2*i;

System.out.println();

}

}

}
