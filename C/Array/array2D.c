//2 D ARRAY 

#include<stdio.h>
int main(int argc, char const *argv[])
{
    int marks[3][2]= {{1,2},{3,4},{5,6}};

    //printing array
    printf("\n 2 D array elements are \n");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<2;j++)
        {
            //printf(" Element at index %d %d is %d \n",i,j,marks[i][j]);
            printf("%d ", marks[i][j]);
        }
        printf("\n");
    }
    return 0;
}
