public class ObjComputador {
    private String serial;
    private String marca;
    private int memoriaRAM;
    private int Discoduro;
    private double precio;
    private String Nombreusuario;
    private boolean disponible;
    private int Cantidad;

    public ObjComputador(String serial, String marca, int memoriaRAM, int discoduro, double precio,
            String nombreusuario, boolean disponible, int cantidad) {
        this.serial = serial;
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        Discoduro = discoduro;
        this.precio = precio;
        Nombreusuario = nombreusuario;
        this.disponible = disponible;
        Cantidad = cantidad;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

}