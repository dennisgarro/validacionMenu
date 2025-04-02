
import java.util.Scanner;
import java.util.Stack;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        Stack<ObjComputador> c = new Stack<>();
        Stack<ObjTablet> t = new Stack<>();
        int opt = 0;

        while (bandera) {
            System.out.println("Bienvenido al Departamento de Sistemas");
            System.out.println("Ingrese la Opción que desea:");
            System.out.println("1: Computador");
            System.out.println("2: Tablet");
            System.out.println("3: Salir");
            
            if (!sc.hasNextInt()) {
                System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 3.");
                sc.next(); 
                continue; 
            }

            opt = sc.nextInt();
            sc.nextLine(); 

            if (opt < 1 || opt > 3) {
                System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 3.");
                continue; 
            }

            switch (opt) {
                case 1:
                    MenuComputador cp = new MenuComputador();
                    c = cp.Computador(sc);
                    break;
                case 2:
                    System.out.println("Página en mantenimiento.");
                    break;
                case 3:
                    bandera = false;
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        }
        sc.close();
    }
}
