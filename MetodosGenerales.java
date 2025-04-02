import java.util.LinkedList;
import java.util.Scanner;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);

    public LinkedList<ObjComputador> IngresarComputador(LinkedList<ObjComputador> c) {
        ObjComputador o = new ObjComputador();
        System.out.println("Por favor ingrese el serial");
        o.setSerial(sc.next());
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("Ingrese La memoria Ram");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setMemoriaRAM(sc.nextInt());
        System.out.println("Ingrese la capacidad del disco duro");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setDiscoduro(sc.nextInt());
        System.out.println("Ingrese el precio del computador");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());
        o.setDisponible(true);
        o.setCantidad(1);
        c.offer(o);
        return c;
    }

    public LinkedList<ObjComputador> PrestarComputador(LinkedList<ObjComputador> c) {
        while (c.isEmpty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a prestar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreusuario(sc.next());
                o.setDisponible(false);
            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public LinkedList<ObjComputador> ModificarComputador(LinkedList<ObjComputador> c) {
        while (c.isEmpty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a Modificar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreusuario(sc.next());

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public LinkedList<ObjComputador> DevolverComputador(LinkedList<ObjComputador> c) {
        while (c.isEmpty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a Modificar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {

                o.setNombreusuario(null);
                o.setDisponible(true);

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }
}
