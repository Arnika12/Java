#include<stdio.h>

//with argument with return value
/*int sum(int a,int b)
{
    return a+b;
}
int main()
{
    int a=3;int b=9;int c;
    c=sum(a,b);
    printf("The sum is %d \n",c);
}*/

//with argument without return value
/*void printstar(int n)
{
    for(int i=0;i<n;i++)
        printf("%c \t",'*');
}
int main()
{
    printstar(9);
    return 0;
}*/

//without argument with return value
/*int takeinput()
{
    int a;
    printf("Enter a number \n ");
    scanf("%d", &a);
    return a;   //optional
}
int main()
{
    takeinput();
    return 0;
}*/

//without argument without return value
#include<math.h>
void multiply()
{
    int a,c;
    printf("Enter a number \n ");
    scanf("%d", &a);
    printf("You entered %d \n",a);
    c=pow(a,2);
    printf("The square is %d \n",c);
}
int main()
{
    multiply();
    return 0;
}