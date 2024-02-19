/*Write a program that takes user input for different data types (int, float, char) 
and displays them using appropriate format specifiers.*/

#include<stdio.h>
int main()
{
    int a;
    float b;

    printf("Enter a integer value : ");
    scanf("%d" ,&a);
    printf("Enter a float value : ");
    scanf("%f" ,&b);
    printf("\n You entered integer value = %d", a);
    printf("\n You entered float value = %f", b);
    
    return 0;
}
