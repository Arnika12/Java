#include<stdio.h>

int main(int argc, char const *argv[])
{
    int age;
    printf("Enter your age : ");
    scanf("%d" , &age);

    switch(age)
    {
        case 10:
            printf("your age is 10 \n");
            break;
        
        case 20:
            printf("your age is 20 \n");
            break;

        case 30:
            printf("your age is 30 \n");

        default:
            printf("your age is not 10,20,30 \n");
            break;
    }
    return 0;
}
