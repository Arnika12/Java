/*Implement a program that demonstrates the difference between `printf` and `scanf` 
format specifiers (%d, %i, %u, %x, %p) with examples.*/

#include <stdio.h>

int main() {
    int num = 65;
    int hexNum = 255;
    int* ptr = &num;

    // Printing values using different format specifiers
    printf("Decimal representation:\n");
    printf("%%d: %d\n", num);
    printf("%%i: %i\n", num);
    printf("%%u: %u\n", num);
    printf("%%x: %x\n\n", hexNum);

    // Reading values using different format specifiers
    int input;
    printf("Enter a number in decimal format: ");
    scanf("%d", &input);
    printf("You entered: %d\n\n", input);

    unsigned int unsignedInput;
    printf("Enter a number in unsigned decimal format: ");
    scanf("%u", &unsignedInput);
    printf("You entered (unsigned): %u\n\n", unsignedInput);

    int hexadecimalInput;
    printf("Enter a number in hexadecimal format (without 0x prefix): ");
    scanf("%x", &hexadecimalInput);
    printf("You entered (hexadecimal): %x\n\n", hexadecimalInput);

    // Printing and reading memory addresses using %p
    printf("Printing memory address using %%p:\n");
    printf("Address of num: %p\n\n", (void *)ptr);

    void* readAddress;
    printf("Enter a memory address (in hexadecimal, no 0x prefix): ");
    scanf("%p", &readAddress);
    printf("You entered memory address: %p\n", readAddress);

    return 0;
}
