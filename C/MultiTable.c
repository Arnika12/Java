#include <stdio.h>
//Mutlication table 

int main()
{
    int a;
    //int multi;
    printf("Enter a number to print multiplication = ");
    scanf("%d", &a);
    printf("\t Multiplication table of %d ",a);
    printf("\n");
    for(int i=1;i<=10;i++)
    {
        //multi=a*i;
        //printf("\t \t  %d \n" , multi);
        printf("%d * %d = %d \n ",a,i,a*i);
    }
    return 0;
}