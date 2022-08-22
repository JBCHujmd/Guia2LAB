import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int lado1;
        int lado2;
        int lado3;
        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        System.out.print("Ingrese la cantidad de triangulos: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese lado 1: ");
            lado1 = sc.nextInt();
            System.out.print("Ingrese lado 2: ");
            lado2 = sc.nextInt();
            System.out.print("Ingrese lado 3: ");
            lado3 = sc.nextInt();
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.print("Es un triángulo equilatero");
                cant1++;
            } else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.print("Es un triángulo isóceles");
                    cant2++;
                } else {
                    System.out.print("Es un triángulo escaleno");
                    cant3++;
                }
            }
        }
        System.out.println("Cantidad de triángulos equilateros:" + (cant1));
        System.out.println("Cantidad de triángulos isóceles:" + (cant2));
        System.out.println("Cantidad de triángulos escalenos:" + (cant3));
        if (cant1 < cant2 && cant1 < cant3) {
            System.out.print("Hay menor cantidad de triángulos equilateros");
        } else {
            if (cant2 < cant3) {
                System.out.print("Hay menor cantidad de triángulos isósceles");
            } else {
                System.out.print("Hay menor cantidad de triángulos escalenos");
            }
        }
    }
}