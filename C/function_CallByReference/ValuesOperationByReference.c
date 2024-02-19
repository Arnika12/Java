#include <stdio.h>
/*perform operation on  two values using function call by reference
given two numbers A and B add them then subtract them and assign them 
to A and B using call by reference
a=3
b=4
after performing operation
a=7
b=1 */

void operation(int *a , int *b)
{
    *a = *a + *b ;
//for obtaining subtraction we take updated value of a then substract b for 2 times 
//because once we added above and another we have to substract as part of our operation.
    *b=*a - 2 * (*b);   //valid
    //*b=*a - (*b + *b) ;   //valid
    return;
}
int main()
{
    int a=30,b=4;
    printf("The value of a %d and b %d \n ",a,b);
    operation(&a , &b);
    printf("The value of a %d and b %d \n ",a,b);
    return 0;
}

    