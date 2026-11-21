public class Auto extends Vehiculo {
    public String placa;
    public Auto(String modelo, String placa) {
        super(modelo);
        // Validación de la placa: debe tener 7 caracteres y al menos 1 letra y 1 número
        if (placa.length() == 7 && contieneLetra(placa) && contieneNumero(placa)) {
            this.placa = placa;
        } else {
            System.out.println("La placa es inválida. Debe tener 7 caracteres y al menos 1 letra y 1 número.");
        }
    }
    //Verifica si la placa contiene al menos una letra
    public boolean contieneLetra(String placa) {
        for (int i = 0; i < placa.length(); i++) {
            if (Character.isLetter(placa.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    //Verifica si la placa contiene al menos un número
    public boolean contieneNumero(String placa) {
        for (int i = 0; i < placa.length(); i++) {
            if (Character.isDigit(placa.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public void tocarBocina() {
        System.out.println("¡Beep beep!");
    }
}
