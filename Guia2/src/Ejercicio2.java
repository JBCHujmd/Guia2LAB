import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Escriba el numero para el eje x: ");
        x = sc.nextInt();
        System.out.print("Escriba el numero para el eje y: ");
        y = sc.nextInt();

        if(x>=0 && y >=0){
            System.out.println("Cuadrante uno");
        }
        else if(x<0 && y > 0){
            System.out.println("Cuadrante dos");
        }
        else if (x < 0 && y < 0){
            System.out.println("Cuadrante tres");
        }
        else if (x > 0 && y <0){ 
            System.out.println("Cuadrante cuatro");
        }
    }
}