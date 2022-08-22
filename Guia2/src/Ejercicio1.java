import java.util.*;

    public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.print("Introduzca el numero: ");                                                         
            num = sc.nextInt();
            System.out.println("Tabla del " + num);
            for(int i = 1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + num*i);                                                     
        }
    }
}
