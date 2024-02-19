#include <stdio.h>

int main() {
    char input;
    float conversionFactors[] = {0.0, 0.621371, 0.0833333, 0.393701, 0.453592, 0.0254}; // Index 0 is unused for easy menu mapping
    char *menuOptions[] = {"", "kms to inches", "inches to foot", "cms to inches", "pound to kgs", "inches to meters"};
    float first, second;
    int choice;

    while (1) {
        printf("\nEnter your choice: \nq for quit\n1. kms to inches\n2. inches to foot\n3. cms to inches\n4. pound to kgs\n5. inches to meters\n");
        scanf(" %c", &input);

        if (input == 'q' || input == 'Q') {
            printf("\nQuitting the program...\n");
            break;
        }

        choice = input - '0'; // Convert character to integer

        if (choice >= 1 && choice <= 5) {
            printf("Enter value: ");
            scanf("%f", &first);
            second = first * conversionFactors[choice];
            printf("The value of %.2f %s is %.2f %s\n", first, menuOptions[choice], second, choice == 4 ? "kgs" : "units");
        } else {
            printf("Incorrect choice\n");
        }
    }

    return 0;
}
