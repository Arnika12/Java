#include <stdio.h>
//changing variable value using function call by reference
void changevalue(int *a)
{
    *a=555;
    return;
}

int main()
{
    int a=111;
    printf("Value of a is %d \n",a);
    changevalue(&a);
    printf("Value of a is %d \n",a);
    return 0;
}
