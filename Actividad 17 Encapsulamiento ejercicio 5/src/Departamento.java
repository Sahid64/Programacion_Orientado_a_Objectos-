public class Departamento {
    private int idDepartamento;
    private String nombre;
    private Curso[] cursos;

    public Departamento(int idDepartamento, String nombre, Curso[] cursos){
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public int getIdDepartamento(){
        return idDepartamento;
    }
    public void setIdDepartamento(int idDepartamento){
        this.idDepartamento = idDepartamento;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Curso[] getCursos(){
        return cursos;
    }
    public void setCursos(Curso[] cursos){
        this.cursos = cursos;
    }

    public void mostrarDepartamento(){
        System.out.println("Departamento ID: "+idDepartamento+" Nombre: "+nombre);
        for (Curso curso: cursos){
            if (curso != null){
                curso.mostrarCurso();
                System.out.println("------------------");
            }
        }
    }
}