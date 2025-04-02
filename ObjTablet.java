public class ObjTablet {
    
    private String serialT;
    private double tamaño;
    private String marcaT;
    private double precioT;
    private String NombreUsuarioT;
    private boolean disponibleT;
    private int CantidadT;
    public ObjTablet(String serialT, double tamaño, String marcaT, double precioT, String nombreUsuarioT,
            boolean disponibleT, int cantidadT) {
        this.serialT = serialT;
        this.tamaño = tamaño;
        this.marcaT = marcaT;
        this.precioT = precioT;
        NombreUsuarioT = nombreUsuarioT;
        this.disponibleT = disponibleT;
        CantidadT = cantidadT;
    }
    
    public ObjTablet() {
    }

    public String getSerialT() {
        return serialT;
    }
    public void setSerialT(String serialT) {
        this.serialT = serialT;
    }
    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    public String getMarcaT() {
        return marcaT;
    }
    public void setMarcaT(String marcaT) {
        this.marcaT = marcaT;
    }
    public double getPrecioT() {
        return precioT;
    }
    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }
    public String getNombreUsuarioT() {
        return NombreUsuarioT;
    }
    public void setNombreUsuarioT(String nombreUsuarioT) {
        NombreUsuarioT = nombreUsuarioT;
    }
    public boolean isDisponibleT() {
        return disponibleT;
    }
    public void setDisponibleT(boolean disponibleT) {
        this.disponibleT = disponibleT;
    }
    public int getCantidadT() {
        return CantidadT;
    }
    public void setCantidadT(int cantidadT) {
        CantidadT = cantidadT;
    }
    
}
