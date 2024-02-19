//recursion
#include<stdio.h>

//using recursion
int recursion(int num)
{
    if(num==1 || num==2)
    {
        return num-1;
    }
    else
    {
        return  recursion(num-1) + recursion(num-2);
    }
}

//using iteration
int iterative_fibonacci(int num)
{
    int a=0; int b=1; int c;
    for(int i=0;i<num-1;i++)
    {
        //printf('a');
        c=a+b;
        a=b;
        b=c;
    }
    return a;
}
int main()
{
    int n;
    printf("Enter the index to get fibonacci series : ");
    scanf("%d" ,&n);
    printf(" fibonacci series using recursion : %d \n ",recursion(n));
    printf(" \n fibonacci series using iteration : %d \n ",iterative_fibonacci(n));
    return 0;
}
