public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    protected boolean nombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }//.trim = elimina los espacios. .isEmpty = verifica que si tiene algo
}
