import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingresa un valor (" + i + "): ");
            int valor = sc.nextInt();
            System.out.println("El valor ingresado es: " + valor);
        }
    }
}
