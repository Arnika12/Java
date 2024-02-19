// infinite goto

#include<stdio.h>
int main(int argc, char const *argv[])
{
    label:
        printf("Hello World !!");
    
    printf("ABCD");
    goto label ;
    return 0;
}

// **********************************************

//not printing some content
#include<stdio.h>
int main()
{
    label:
        printf("Hello World !!");
        goto end ;   // from here control directly go to end by skipping line 20
    printf("ABCD");
    end:
        printf("\n END OF THE CODE !!");
    return 0;
}

