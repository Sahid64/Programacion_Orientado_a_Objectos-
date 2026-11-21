public class Producto {
    protected double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    protected boolean precioValido() {
        return precio > 0;
    }
}
