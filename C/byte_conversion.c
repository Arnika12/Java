/*How would you modify the program to display the sizes of each 
data type (int, float, char) in bytes?*/

#include <stdio.h>

int main() {
    printf("Size of int: %lu bytes\n", sizeof(int));
    printf("Size of float: %lu bytes\n", sizeof(float));
    printf("Size of char: %lu byte\n", sizeof(char));

    return 0;
}

