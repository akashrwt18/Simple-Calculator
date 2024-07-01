import java.util.Scanner;

class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a >= b ? a - b : b - a;
    }

    public static double div(double a, double b) {
        return a >= b ? a / b : b / a;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        double a, b;
        do {
            System.out.println("\nMenu ");
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction (always subtract higher value with lower)");
            System.out.println("Enter 3 for division (always divide by taking greater value in numerator)");
            System.out.println("Enter 4 for Multiplication");
            System.out.println("Enter 5 for modulo");
            System.out.println("Enter 0 for exit");

            System.out.println("Enter a choice ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter value of a and b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Addition is " + add(a, b));
                    break;

                case 2:
                    System.out.println("Enter value of a and b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Subtraction is " + sub(a, b));
                    break;
                
                case 3: 
                    System.out.println("Enter value of a and b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Division is " + div(a, b));
                    break;

                case 4: 
                    System.out.println("Enter value of a and b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Multiplication is " + multiply(a, b));
                    break;

                case 0:
                    System.out.println("Exiting the calculator");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (ch != 0);

        sc.close();
    }
}