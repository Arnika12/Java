#include <stdio.h>
//print hello world for 10 time using recursion

void printHW(int n);

int main()
{
    printHW(10);
    return 0;
}

void printHW(int n)
{
    //base case
    if(n==0)
    {
        return;
    }
    printf("HELLO WORLD !!! \n");
    printHW(n-1);
}