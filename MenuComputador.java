
import java.util.Scanner;
import java.util.Stack;

public class MenuComputador {

    public Stack<ObjComputador> Computador(Scanner sc) {
        Stack<ObjComputador> c = new Stack<>();
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. ingresar un computador");
            System.out.println("2. prestar un computador");
            System.out.println("3. devolver computador");
            System.out.println("4 volver al menú Principal");
            if (!sc.hasNextInt()) {
                System.out.println("Opcion no valida ");
                sc.next();
                continue;
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 4) {
                System.out.println("Ingrese una opcion de 1 a 4 por favor ");
                sc.next();
                continue;

            }

            switch (opt) {
                case 1:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 2:
                    System.out.println("Pagina 2 en mantenimiento");
                    break;
                case 3:
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return c;
    }

}
