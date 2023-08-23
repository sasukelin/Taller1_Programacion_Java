import java.util.Scanner;
public class divicion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un primer número: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int divisor = scanner.nextInt();

        double resultado = (double)dividendo / (double)divisor;
        int residuo = dividendo % divisor;

        System.out.println("El resultado de la división es: " + resultado);

        if (residuo == 0) {
            System.out.println("La división es exacta.");
        }else  {
            System.out.println("La división no es exacta.");
        }
    }
}