public class Persona {
    public String nombre;
    public int edad;
    public double altura;
    public double peso;
        public Persona(String nombre, int edad, double altura, double peso) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
            this.peso = peso;
        }
        public void mostrarDatos(){
            System.out.println("Mi nombre es: "+this.nombre);
            System.out.println("Mi edad es: "+this.edad);
            System.out.println("Mi altura es: "+this.altura);
            System.out.println("Mi peso es: "+this.peso);
        }
}
