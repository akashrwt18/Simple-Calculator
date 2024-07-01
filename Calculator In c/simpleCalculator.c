#include <stdio.h>
#include "Util.h"

int main() {
        int choice;
        do
        {
            printf("Menu :\n");
            printf("1 Adding two numbers\n");
            printf("2 Subtraction two numbers\n");
            printf("3 Division of two numbers\n");
            printf("4 Multiplication of two numbers\n");
            printf("0 Ending program\n");
            printf("Enter a choice : ");
            scanf("%d", &choice);
            switch (choice)
            {
            case 1:{
                int x, y;
                printf("Enter a number : ");
                scanf("%d", &x);
                printf("Enter a number : ");
                scanf("%d", &y);
                printf("Addition of two number is %d\n", add(x, y));
                break;
            }
             case 2:{
                int x, y;
                printf("Enter a number : ");
                scanf("%d", &x);
                printf("Enter a number : ");
                scanf("%d", &y);
                printf("Subtraction of two number is %d\n", sub(x, y));
                break;
            }
            case 3:{
                int x, y;
                printf("Enter a number : ");
                scanf("%d", &x);
                printf("Enter a number : ");
                scanf("%d", &y);
                if (y == 0){
                    printf("Can not divide with zero\n");
                    printf("Enter a number : ");
                    scanf("%d", &y);
                }
                printf("Division of two number is %d\n", sub(x, y));
                break;
            }
            default:
                if (choice != 0)
                {
                    printf("Invalid input\n");
                } else {
                     printf("Exiting calculator\n");
                }
                break;
            }
        } while (choice != 0);
        
    return 0;
}