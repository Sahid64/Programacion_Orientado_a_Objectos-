public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie,int edad, double peso){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre(){return nombre;}
    public String getEspecie(){return especie;}
    public int getEdad() {return edad;}
    public double getPeso(){return peso;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEspecie(String especie) {this.especie = especie;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setPeso(double peso) {this.peso = peso;}

    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
    }
    public void clasificarPeso(double peso){
        if (peso<3){
            System.out.println("Tiene un peso menor a 3kg");
        }
        if (peso>=3&&peso<=15){
            System.out.println("Tiene un peso de alrededor de 3 a 15kg");
        }
        if (peso>15){
            System.out.println("Tiene un peso mayor a 15kg");
        }
    }
}
