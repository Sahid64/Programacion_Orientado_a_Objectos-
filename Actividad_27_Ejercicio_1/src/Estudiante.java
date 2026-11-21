public class Estudiante extends Persona{
    public String matricula;
    public Estudiante(String nombre, int edad, String matricula){
        super(nombre,edad);
        this.matricula=matricula;
    }
    public void matricula(){
        System.out.println("Matricula: "+matricula);
    }
}