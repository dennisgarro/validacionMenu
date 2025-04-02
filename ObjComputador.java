
public class ObjComputador {

    private String serial;
    private String marca;
    private int memoriaRAM;
    private int Discoduro;
    private double precio;
    private String Nombreusuario;
    private boolean disponible;
    private int Cantidad;

    public ObjComputador(String serial, String marca, int memoriaRAM, int Discoduro, double precio, String Nombreusuario, boolean disponible, int Cantidad) {
        this.serial = serial;
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.Discoduro = Discoduro;
        this.precio = precio;
        this.Nombreusuario = " ";
        this.disponible = true;
        this.Cantidad = Cantidad;

    }

    public ObjComputador() {

    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getDiscoduro() {
        return Discoduro;
    }

    public void setDiscoduro(int discoduro) {
        Discoduro = discoduro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreusuario() {
        return Nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        Nombreusuario = nombreusuario;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("PC-serial: " + serial + " marca: " + marca + " memoria ram : " + memoriaRAM + "disco duro: " + Discoduro + "precio: " + precio + "nombre del usuario:  " + Nombreusuario + " y su estado es :" + disponible);
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
