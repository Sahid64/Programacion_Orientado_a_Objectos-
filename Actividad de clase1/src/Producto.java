public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String idProducto,String nombre,double precio,int cantidad){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void mostrarProducto(){
        System.out.println("ID del producto: ");
        System.out.println("Nombre: ");
        System.out.println("Precio: ");
        System.out.println("Cantidad: ");
    }
    public String getIdProducto(){
        return idProducto;
    }
    public void setIdProducto(String idProducto){
        this.idProducto = idProducto;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    //Pendiente el metodo para verificar la idProducto unico:



}
