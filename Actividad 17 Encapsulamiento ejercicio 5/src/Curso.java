public class Curso {
    private int idCurso;
    private String nombre;
    private  Profesor profesor;
    private Estudiante[] estudiantes;

    public Curso(int idCurso, String nombre, Profesor profesor, Estudiante[] estudiantes){
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public int getIdCurso(){
        return idCurso;
    }
    public void setIdCurso(int idCurso){
        this.idCurso = idCurso;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    public Estudiante[] getEstudiantes(){
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes){
        this.estudiantes = estudiantes;
    }
    public void mostrarCurso(){
        System.out.println("Curso ID: "+idCurso+" Nombre: "+nombre);
        if (profesor != null){
            System.out.println("Profesor: ");
            profesor.mostrarProfesor();
        }
        System.out.println("Estudiantes: ");
        for (Estudiante estudiante:estudiantes){
            if (estudiante != null){
                estudiante.mostrarEstudiante();
            }
        }
    }
}