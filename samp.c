/* C program for diamond pattern printing using numbers and stars */

#include <stdio.h>

int main()

{
    int i,j,count=1,n;
    printf("A number");
    scanf("%d",&n);
    for(i=1;i<=n;i++)

{

for(j=1;j<=i;j++)

{

if(j<i)

printf("%d*",count++);

else

printf("%d",count++);

}

printf("\n");

}

count=count-n;

for(i=n;i>=1;i--)

{ for(j=1;j<=i;j++)

{

if(j<i)

printf("%d*",count++);

else

printf("%d",count++);

}
/* C program for diamond pattern printing using numbers and stars */

#include <stdio.h>

int main()

{

int i,j,count=1,n;

printf("Enter a numbern");

scanf("%d",&n);

for(i=1;i<=n;i++)

{

for(j=1;j<=i;j++)

{

if(j<i)

printf("%d*",count++);

else

printf("%d",count++);

}

printf("n");

}

count=count-n;

for(i=n;i>=1;i–)

{ for(j=1;j<=i;j++)

{

if(j<i)

printf("%d*",count++);

else

printf("%d",count++);

}

count=(count+1)-2*i;

printf("n");

}

return 0;

}


count=(count+1)-2*i;

printf("\n");

}

return 0;

}

