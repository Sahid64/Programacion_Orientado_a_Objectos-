public class Animal {
    public String especie;
    public Animal(String especie) {
        //La especie no debe contener caracteres especiales ni números
        if (especie.matches("[a-zA-Z ]+")) {
            this.especie = especie;
        } else {
            System.out.println("La especie no puede contener caracteres especiales ni números.");
        }
    }
    public void hacerSonido() {
        if (especie != null) {
            System.out.println("El " + especie + " hace un sonido.");
        }
    }
}