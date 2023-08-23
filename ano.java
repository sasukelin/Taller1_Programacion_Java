import java.util.Scanner;
public class ano {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresar un año: ");
            int annio = scanner.nextInt();

            if ((annio % 4 == 0 && annio % 100 != 0) || annio % 400 == 0) {
                System.out.println("El año " + annio + " es bisiesto");
            } else {
                System.out.println("El año " + annio + " no es bisiesto");
            }
        }
    }


