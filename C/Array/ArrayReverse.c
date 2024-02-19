#include <stdio.h>
// WAP to print given array an reverse array of it 

void originalarr(int arr[],int size)
{
    for(int i=0 ; i<size ; i++)
    {
        printf("%d  " ,arr[i]);
    }
    printf("\n");
}

void reversearr(int arr[],int size)
{
    int temp;
    for(int i=0 ; i<size/2 ; i++)
    {
        temp=arr[size-i-1];
        arr[size-i-1] = arr[i];
        arr[i]=temp;
    }
    originalarr(arr,size);  
    //we can directly call a above function or also can write code to print array here
}

int main(int argc, char const *argv[])
{
    int arr[] = {11,22,33,44,55,6,67};
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("Original Array  \n ");
    originalarr (arr , size);

    printf("\n Reversed Array \n ");
    reversearr(arr,size);
    /*instead of writinf display code in reverearr fn or calling originalarr fn there 
    we can directly call "originalarr(arr,size)" here*/
    return 0;
}
