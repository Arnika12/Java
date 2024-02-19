//allow user to enter 2 strings & then concatenate them by sayint str1 is friend of str2 
//for eg : A is friend of B.
//make str3 and concatenate above text

#include<stdio.h>
#include<string.h>

int main(int argc, char const *argv[])
{
    char str1[100], str2[100];
    char str3[300]=" is a friend of ";
    printf("Enter string 1 : ");
    scanf ("%s" ,str1);
    printf("Enter string 2 : ");
    scanf ("%s" ,str2);

    printf("You entered string 1 as %s and string 2 as %s \n",str1,str2);
    
    printf("\n The concatenation of both string is \n ");
    puts(strcat(str1, (strcat(str3, str2))));   
    //printf(strcat(str1,(strcat(str3,str2))));   // see comment at end
    return 0;
}

/*  both line 20 and 21 give same result 
puts(strcat(str1, (strcat(str3, str2))));: Concatenates str3 and str2 first, 
then appends the result to str1. It prints the concatenated string using puts().

The code concatenates str3 (" is a friend of ") and str2, then concatenates 
the result with str1. Finally, it prints the concatenated string.*/