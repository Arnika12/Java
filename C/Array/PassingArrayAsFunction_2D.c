#include <stdio.h>
//passing array as function parameter  *****   2D ARRAY   *****

// Pass array and its size as parameters
void PassArray(int arr[3][3]) 
{
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++)
        {
            printf("The value of array at index %d , %d is %d\n", i,j, arr[i][j]);
        }
    }
}

// Pass pointer and the size of the array as parameters
void PassPointer(int **ptr) 
{
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++)
        {
            printf("The value of array at index %d , %d is %d\n", i,j, ptr[i][j]);
        }
    }
}

int main() {
     // Declare a 2D array
  int array[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    printf("Passing array to function (using array syntax):\n");
    PassArray(array);

     // Declare a pointer to the array
  int **arrayPointer = array;

  // Print the elements of the array using the pointer
  printf("\nPassing array to function (using pointer syntax):\n");
  PassPointer(arrayPointer);

    return 0;
}
