public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(int idEstudiante, String nombre, int edad, double promedio){
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public int getIdEstudiante(){
        return idEstudiante;
    }
    public void setIdEstudiante(int idEstudiante){
        this.idEstudiante = idEstudiante;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public void mostrarEstudiante(){
        System.out.println("Estudiante ID: "+idEstudiante+" Nombre: "+nombre+" Edad: "+edad+" Promedio: "+promedio);
    }
}