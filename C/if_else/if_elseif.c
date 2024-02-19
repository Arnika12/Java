#include <stdio.h>

int main()
{
    int choice;
    printf("*** Info about passing subjects ***");
    printf("\n\nEnter which subject you have pass choose \n1.science \n 2.math \n12.for math+science both");
    printf("\n\nEnter your choice (1/2) :  ");
    scanf ("%d" , &choice);
    if(choice==1)
    {
        printf("you won rs.10");
    }
    else if(choice==2)
    {
        printf("you won 10 rs.");
    }
    else if(choice==12)
    {
        printf("you won rs 45");
    }
    else
    {
        printf("enter right choice");
    }
    return 0;
}
