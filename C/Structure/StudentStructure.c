#include <stdio.h>
#include <string.h>

struct Student
{
    int id;
    char name[20];
    int marks;
} A,B,C;
//struct Student A,B,C;   declare as a global variable

int main(int argc, char const *argv[])
{
    //struct Student A,B,C;   declare as a local variable
    A.id = 1;
    B.id = 2;
    C.id = 3;

    strcpy(A.name, "Pradnya");
    strcpy(B.name, "ABC");
    strcpy(C.name, "DEF");

    A.marks =78;
    B.marks = 90;
    C.marks = 70;

    printf( "Student A has name %s , id as %d , marks as %d \n",A.name,A.id,A.marks);
    printf( "Student A has name %s , id as %d , marks as %d \n",B.name,B.id,C.marks);
    printf( "Student A has name %s , id as %d , marks as %d \n",A.name,B.id,C.marks);
    
    return 0;
}
