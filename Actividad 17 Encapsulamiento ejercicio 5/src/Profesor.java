public class Profesor {
    private int idProfesor;
    private String nombre;
    private int edad;
    private String materia;

    public Profesor(int idProfesor, String nombre, int edad, String materia){
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public int getIdProfesor(){
        return idProfesor;
    }
    public void setIdProfesor(int idProfesor){
        this.idProfesor = idProfesor;
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
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }

    public void mostrarProfesor(){
        System.out.println("Profesor ID: "+idProfesor+" Nombre: "+nombre+" Edad: "+edad+" Materia: "+materia);
    }
}
