import java.util.Scanner;
public class ordenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresar el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingresar el segundo número: ");
            int num2 = scanner.nextInt();
            System.out.print("Ingresar el tercer número: ");
            int num3 = scanner.nextInt();
            System.out.print("Ingresar el cuarto número: ");
            int num4 = scanner.nextInt();
            if (num1 >= num2 && num2 >= num3 && num3 >= num4) {
                System.out.println(num1 + " - " + num2 + " - " + num3 + " - " + num4);
            } else if (num2 >= num1 && num1 >= num3 && num3 >= num4) {
                System.out.println(num2 + " - " + num1 + " - " + num3 + " - " + num4);
            } else if (num3 >= num1 && num1 >= num2 && num2 >= num4) {
                System.out.println(num3 + " - " + num1 + " - " + num2 + " - " + num4);
            } else if (num4 >= num1 && num1 >= num2 && num2 >= num3) {
                System.out.println(num4 + " - " + num1 + " - " + num2 + " - " + num3);
            } else if (num4 >= num3 && num3 >= num1 && num1 >= num2) {
                System.out.println(num4 + " - " + num3 + " - " + num1 + " - " + num2);
            } else if (num3 >= num2 && num2 >= num1 && num1 >= num4) {
                System.out.println(num3 + " - " + num2 + " - " + num1 + " - " + num4);
            } else if (num2 >= num3 && num3 >= num1 && num1 >= num4) {
                System.out.println(num2 + " - " + num3 + " - " + num1 + " - " + num4);
            } else {
                System.out.println("¡los numeros de menor amenor son!");
            }
        }
    }
