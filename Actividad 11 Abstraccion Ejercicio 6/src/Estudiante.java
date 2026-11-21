public class Estudiante {
    public String nombre;
    public String matricula;
    public double calificacion;

    public Estudiante(String nombre, String matricula, double calificacion){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }
    public void calcularPromedio(double cali1, double cali2){
        double promedio = (cali1+cali2)/2;
        System.out.println("Tu calificación es: "+promedio);
    }
    public void mostrarDatos(double cali1,double cali2){
        double num = (cali1+cali2)/2;
        System.out.println("Nombre: "+nombre+" Matricula: "+matricula+" Calificación: "+num);
        if (num<6){
            for (int i=1;i<=10;i++) System.out.println("Necesito ponerme a estudiar más");
        }
        if (num>=6){
            if (num<=7.99) System.out.println("Intenta mejorar el siguiente semestre");
        }
        if (num>=8){
            if (num<=9.99) System.out.println("Excelente");
        }
        if (num==10) System.out.println("Vas muy bien, sigue asi");
    }
}
