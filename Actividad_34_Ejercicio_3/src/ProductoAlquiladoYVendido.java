public class ProductoAlquiladoYVendido extends Producto implements Vender, Alquilar {
    public ProductoAlquiladoYVendido(double precio) {
        super(precio);
    }

    public void vender() {
        if (precioValido()) {
            System.out.println("El producto ha sido vendido por: $" + precio);
        } else {
            System.out.println("Error: El precio del producto debe ser mayor a 0 para vender.");
        }
    }

    public void alquilar() {
        if (precioValido()) {
            System.out.println("El producto ha sido alquilado por: $" + precio);
        } else {
            System.out.println("Error: El precio del producto debe ser mayor a 0 para alquilar.");
        }
    }
}
