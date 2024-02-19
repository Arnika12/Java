/* take input from user 
take 0 to print triangulaer star pattern 
take 1 for reverse triangulaer star pattern & then print star pattern accordingly.
*
**
***
****   -> triangulaer star pattern

****
***
**
*      -> reverse triangulaer star pattern
*/

#include <stdio.h>

void triangulerStar(int length) {
    for (int i = 1; i <= length; i++) {  //if we put i=0 then also same result
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
}

void reverseTriangulerStar(int length) {
    for (int i = length; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        printf("\n");
    }
}

int main() {
    int choice, length;

    printf("Enter the length of the star pattern: ");
    scanf("%d", &length);

    printf("Choose the pattern: \n");
    printf("1. Triangular star pattern\n");
    printf("2. Reverse triangular star pattern\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            triangulerStar(length);
            break;
        case 2:
            reverseTriangulerStar(length);
            break;
        default:
            printf("Incorrect choice\n");
            break;
    }

    return 0;
}
