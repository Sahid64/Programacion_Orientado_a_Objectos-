public class DepartamentoInstru {
    private String nombre;
    private int numEmpleados;

    public DepartamentoInstru(String nombre, int numEmpleados){
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getNumEmpleados(){
        return numEmpleados;
    }
    public void setNumEmpleados(int numEmpleados){
        this.numEmpleados = numEmpleados;
    }
    public String clasificarNumEmpleados(){
        if (numEmpleados>=1 && numEmpleados<=9){
            return "1 digito";
        } else if (numEmpleados>=10 && numEmpleados<=99){
            return "2 digito";
        } else if (numEmpleados>=100 && numEmpleados<=999){
            return "3 digito";
        } else {
            return "Más de 3 digitos";
        }
    }
    public void mostrarInformacion(){
        System.out.println("\nNombre: "+nombre);
        System.out.println("Numero de empleados: "+numEmpleados);
        System.out.println("Clasificacion de empleados: "+clasificarNumEmpleados());
    }
}
