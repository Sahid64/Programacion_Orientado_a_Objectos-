public class Universidad {
    private int idUniversidad;
    private String nombre;
    private Departamento[] departamentos;

    public Universidad(int idUniversidad, String nombre, Departamento[] departamento){
        this.idUniversidad = idUniversidad;
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public int getIdUniversidad(){
        return idUniversidad;
    }
    public void setIdUniversidad(int idUniversidad){
        this.idUniversidad = idUniversidad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Departamento[] getDepartamentos(){
        return departamentos;
    }
    public void setDepartamentos(Departamento[] departamentos){
        this.departamentos = departamentos;
    }

    public void mostrarUniversidad(){
        System.out.println("Universidad ID: "+idUniversidad+" Nombre: "+nombre);
        for (Departamento departamento:departamentos){
            if (departamento!=null){
                departamento.mostrarDepartamento();
            }
        }
    }
}
