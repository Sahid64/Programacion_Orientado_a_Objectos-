public class Gerente extends Empleado{
    public String departamento;
    public Gerente(String nombre, int sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento=departamento;
    }
    public void departamento(){
        System.out.println("Departamento: "+departamento);
    }
}