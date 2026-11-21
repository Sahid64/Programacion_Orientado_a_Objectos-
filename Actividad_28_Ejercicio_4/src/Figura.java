public class Figura {
    public String color;
    public Figura(String color) {
        //El color no puede estar vacío ni contener números, y debe comenzar con mayúscula
        if (color.isEmpty() || !color.matches("[A-Za-z]+") || !Character.isUpperCase(color.charAt(0))) {
            //Verifica que no haya espacios
            //Verifica que la primera letra sea mayúscula sin importar que las demás lo sean o no
            System.out.println("El color no puede estar vacío, no debe contener números y debe comenzar con mayúscula.");
        } else {
            this.color = color;
        }
    }
    public void mostrarColor() {
        if (color != null) {
            System.out.println("El color de la figura es: " + color);
        }
    }
}