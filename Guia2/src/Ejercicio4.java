import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int numNegativo = 0;
        int numPositivo = 0;
        int multiplos = 0;
        int ValorAcu = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Inserte el numero " + (i + 1) + ": ");
            num = sc.nextInt();
            if (num > 0) {
                numPositivo = numPositivo + 1;
            } else {
                numNegativo = numNegativo + 1;
            }
            if (num > 0 && num % 2 == 0) {
                ValorAcu = ValorAcu + 1;
            }
            if (num > 0 && num % 15 == 0) {
                multiplos = multiplos + 1;
            }
        }
        System.out.println("Numeros negativos: " + numNegativo);
        System.out.println("Numeros postivos: " + numPositivo);
        System.out.println("Numeros multiplos de 15: " + multiplos);
        System.out.println("Numeros Pares: " + ValorAcu);
    }
}