public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;
    private Factura factura;

    public Cliente(String idCliente,String nombre,String direccion, Factura factura){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.factura = factura;
    }
    public void mostrarFactura() {
        System.out.println("Cliente: " + nombre + ", Dirección: " + direccion);
        if (factura != null) {
            factura.mostrarFactura();
        } else {
            System.out.println("El cliente no tiene factura asociada.");
        }
    }
    public String getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(String idCliente){
        this.idCliente = idCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public Factura getFactura(){
        return factura;
    }
    public void setFactura(Factura factura){
        this.factura = factura;
    }


}
