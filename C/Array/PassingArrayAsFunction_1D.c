#include <stdio.h>
//passing array as function parameter  *****   1D ARRAY   *****

// Pass array and its size as parameters
void PassArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("The value of array at index %d is %d\n", i, arr[i]);
    }
}

// Pass pointer and the size of the array as parameters
void PassPointer(int *ptr, int size) {
    for (int i = 0; i < size; i++) {
        printf("The value of array at index %d is %d\n", i, *(ptr + i));
        //printf("The value of array at index %d is %p\n", i,(ptr + i)); //this will print address of each array element
    }
}

int main() {
    int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
    int size = sizeof(arr) / sizeof(arr[0]);   // Calculate the size of the array

    printf("Passing array to function (using array syntax):\n");
    PassArray(arr, size);

    printf("\nPassing array to function (using pointer syntax):\n");
    PassPointer(arr, size);

    return 0;
}
