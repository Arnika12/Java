#include<stdio.h>
// exercise 2 code with harry (SWITCH USE)

/*kms to inches
inches to foot
cms to inches
pound to kgs
inches to meters*/

int main()
{
    char input;
    float kmsTomiles=0.621371;
    float inchesTofoot=0.0833333;
    float cmsToinches=0.393701;
    float poundTokgs=0.453592;
    float inchesTometers=0.0254;
    float first , second ;

    while(1)  //Starts an infinite loop that continuously prompts the user for input until a break condition is met.
    {
        printf("\nEnter your choice : \n q for quit \n   1. kms to inches \n 2. inches to foot \n 3. cms to inches \n 4. pound to kgs \n 5. inches to meters \n");
        scanf("%c" , &input);

        switch(input)
        {
            case '1':
                printf("Enter value in 'kms' : ");
                scanf("%f" ,&first);
                second=first * kmsTomiles ;
                printf("The value of %f kms is %f inches \n ",first,second);
                break;

            case '2':
                printf("Enter value in 'inches' : ");
                scanf("%f" ,&first);
                second=first * inchesTofoot;
                printf("The value of %f Inches is %f Foot \n ",first,second);
                break;

            case '3':
                printf("Enter value in 'cms' : ");
                scanf("%f" ,&first);
                second=first * cmsToinches;
                printf("The value of %f Cms is %f Inches \n ",first,second);
                break;

            case '4':
                printf("Enter value in 'pound' : ");
                scanf("%f" ,&first);
                second=first * poundTokgs ;
                printf("The value of %f Pound is %f Kgs \n ",first,second);
                break;


            case '5':
                printf("Enter value in 'inches' : ");
                scanf("%f" ,&first);
                second=first * inchesTometers ;
                printf("The value of %f Inches is %f Meter \n ",first,second);
                break;

            case 'q':
            case 'Q':
                printf("\n Quitting the program ..... \n ");
                goto end;
                break;

            default:
                printf("Incorrect choice ");
                

        }
    }
    end:
    return 0;
}
