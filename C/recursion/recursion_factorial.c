#include <stdio.h>

// factorial of given number using recursion

int factorial(int n);

int main()
{
    //taking input
    int n;
    printf("Enter a number to find it's factorial : ");
    scanf("%d" ,&n);

    //function call
    printf("Factorial of %d is %d \n ",n,factorial(n));
    return 0;
}

int factorial(int n)
{
    if(n==1)
    {
        return 1;
    }
    int fact_n_1=factorial(n-1);  //factorial of n-1 term
    int fact= fact_n_1 * n;    // multiply by given number
    return fact; 
}