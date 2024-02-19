#include <stdio.h>
#include <String.h>

int main(int argc, char const *argv[])
{
    char s1[] ="Java";
    char s2[] ="python";
    //printing given string
    printf("String 1 is %s  \n ",s1);
    printf("String 2 is %s  \n ",s2);

    //concate two strings
    //printf("\n The concatination is %s ",strcat(s1,s2));

    //count length of each string 
    printf("\n The length of String 1 is %d  \n ",strlen(s1));
    printf("The length of String 2 is %d  \n ",strlen(s2));

    //reversing string
    //printf("\n The reverse of String 1 is %s  \n ",strrev(s1));
    //printf(" The reverse of String 2 is %s  \n ",strrev(s2));


    //copy one string to another
    // s1 into s3
    char s3[20];
    printf("\n The s1 is now copied into s3 ");
    printf("%s" ,strcpy(s3,s1));

    // s2 into s4
    char s4[20];
    printf("\n The s2 is now copied into s4 %s \n " ,strcpy(s4,s2));
   // printf("%s \n " ,strcpy(s4,s2));


    //comparing 2 strings
    // Changing the value of s2  #####################
    strcpy(s2, "C++");

    // Printing the updated string
    printf("Updated String 2 is %s  \n ", s2);

    printf("\n The strcmp for s1,s2 returned as : %d \n ",strcmp(s1,s2));
    return 0;
}
