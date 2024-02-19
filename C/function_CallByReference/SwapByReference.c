#include <stdio.h>
//swapping two values using function call by reference
void swap(int *a , int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    return;
}
int main()
{
    int a=23,b=99;
    printf("a is %d and b is %d \n ",a,b);
    swap(&a , &b);
    printf("a is %d and b is %d \n ",a,b);
    return 0;
}