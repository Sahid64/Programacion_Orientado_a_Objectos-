public class Factura {
    private String idFactura;
    private Producto[] productos;
    private String numeroFactura;

    public Factura(String idFactura,Producto[] productos, String numeroFactura){
        this.idFactura = idFactura;
        this.productos = productos;
        this.numeroFactura = numeroFactura;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    public void mostrarFactura() {
        System.out.println("ID Factura: " + idFactura + ", Número Factura: " + numeroFactura);
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
        System.out.println("Total: " + calcularTotal());
    }

    //Metodos de get y set
    public String getIdFactura(){
        return idFactura;
    }
    public void setIdFactura(String idFactura){
        this.idFactura = idFactura;
    }
    public Producto[] getProductos(){
        return productos;
    }
    public void setProductos(Producto[] productos){
        this.productos = productos;
    }
    public String getNumeroFactura(){
        return numeroFactura;
    }
    public void setNumeroFactura(String numeroFactura){
        this.numeroFactura = numeroFactura;
    }
}
