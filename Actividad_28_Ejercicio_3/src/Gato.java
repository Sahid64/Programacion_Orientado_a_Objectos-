public class Gato extends Animal {
    public String color;
    public Gato(String especie, String color) {
        super(especie);
        // El color debe tener más de 3 letras y no contener dígitos
        if (color.length() > 3 && !color.matches(".*\\d.*")) {
            this.color = color;
        } else {
            System.out.println("El color debe tener más de 3 letras y no contener dígitos.");
        }
    }
    public void ronronear() {
        if (color != null) {
            System.out.println("El gato ronronea felizmente.");
        }
    }
}