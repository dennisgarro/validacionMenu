import java.util.Scanner;
import java.util.Stack;

public class MenuTablet {
    public Stack<ObjTablet> Tablet(Stack<ObjTablet> t, Scanner sc) {
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            System.out.println("1: Ingresar Tablet");
            System.out.println("2: Prestar Tablet");
            System.out.println("3: Modificar Tablet");
            System.out.println("4: Devolver Tablet");
            System.out.println("5: Volver al menú Principal");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numerico");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 5) {
                System.out.println("Por favor Ingrese un valor de 1 a 5 muchas Gracias");
                continue;
            }
            switch (opt) {
                case 1:
                    System.out.println("pagina1 en manenimiento");
                    break;
                case 2:
                    System.out.println("pagina2 en manenimiento");
                    break;
                case 3:
                    System.out.println("pagina3 en manenimiento");
                    break;
                case 4:
                    System.out.println("pagina4 en manenimiento");
                    break;
                case 5:
                    System.out.println("chao");
                    bandera = false;
                    break;

                default:
                    break;
            }
        }
        return t;
    }
}
