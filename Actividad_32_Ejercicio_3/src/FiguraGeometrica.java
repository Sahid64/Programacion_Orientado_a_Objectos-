public class FiguraGeometrica {
    String color;

    public FiguraGeometrica(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede ser nulo o vacío.");
        }
        this.color = color;
    }

    public void mostrarColor() {
        System.out.println("Color de la figura: " + color);
    }
}