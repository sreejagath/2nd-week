#include<stdio.h>
#include<string.h>
void main() {
    char str[100],str2="";
    printf("Enter string : ");
    scanf("%s", str);
    print_subset(str,str2);
}
void print_subset(char str[100],char str2[100]){
    
    int l;
    l=strlen(str);
    if(l==0){
        printf("%s",str2);
    }
    print_subset(str.substr(1),str2);
}