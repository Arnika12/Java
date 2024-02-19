//1 D ARRAY 

#include<stdio.h>
int main()
{
    int array[5];
    //int array[5]= {12,34,56,54,76};

    //accessing element of array
    for(int i=0;i<5;i++)
    {
        printf("Enter Element at index %d is : ",i);
        scanf("%d" ,&array[i]);
    }

    printf("\n");

    //array printing
    printf("Array elements are : \n");
    for(int i=0;i<5;i++)
    {
        //printf("Element at index %d is : %d \n",i,array[i]);
        printf("%d " , array[i]);
    }
}

