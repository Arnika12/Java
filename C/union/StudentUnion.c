#include <stdio.h>
#include <string.h>

union Student
{
    int id;
    char name[20];
    int marks;
    float percentage ;
} A,B,C;

int main(int argc, char const *argv[])
{
    A.id = 1;
    B.id = 2;
    C.id = 3;

    strcpy(A.name, "Pradnya");
    strcpy(B.name, "ABC");
    strcpy(C.name, "DEF");

    A.marks =78;
    B.marks = 90;
    C.marks = 70;

    C.percentage = 65.23;

    printf( "Student A has name %s  \n",A.name);
    printf( "Student B has  id as %d  %d \n",B.id);
    printf( "Student C has  marks as %d  \n",C.marks);
    printf("Student c has percentage %f \n ",C.percentage);
    return 0;
}
//in union whatever value we have assigned at last will remain active and all other gets corrupted.