#include<stdio.h>
// SUM OF N NATURAL NUMBERS 

int sum(int n);

int main()
{
    int n=5;
    printf("Sum of first %d natural numbers is %d \n ",n,sum(5));
    return 0;
}

int sum(int n)
{
    //base case
    if(n==0)
    {
        return 0;
    }
    int sum_N_1=sum(n-1); // calculate sum of n-1
    int finalsum = sum_N_1 + n;  //caluculate total sum
    return finalsum;
}