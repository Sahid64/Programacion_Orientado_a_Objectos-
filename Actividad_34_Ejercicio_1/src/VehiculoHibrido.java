public class VehiculoHibrido implements Terrestre, Aereo, Acuatico {
    private String nombre;

    public VehiculoHibrido(String nombre) {
        this.nombre = nombre;
    }

    private boolean nombreValido() {
        return nombre != null && !nombre.trim().isEmpty();
    }        //.trim = elimina los espacios. .isEmpty = verifica que si tiene algo

    public void moverPorTierra() {
        if (nombreValido()) {
            System.out.println(nombre + " se está moviendo por tierra.");
        } else {
            System.out.println("Error: nombre inválido para moverse por tierra.");
        }
    }

    public void volar() {
        if (nombreValido()) {
            System.out.println(nombre + " está volando por el aire.");
        } else {
            System.out.println("Error: nombre inválido para volar.");
        }
    }

    public void navegar() {
        if (nombreValido()) {
            System.out.println(nombre + " está navegando por el agua.");
        } else {
            System.out.println("Error: nombre inválido para navegar.");
        }
    }
}
