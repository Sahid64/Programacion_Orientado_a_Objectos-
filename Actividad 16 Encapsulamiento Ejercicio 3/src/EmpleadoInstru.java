
public class EmpleadoInstru {
    private String nombreEm;
    private int edad;
    private double salario;

    public EmpleadoInstru(String nombreEm, int edad, double salario) {
        this.nombreEm = nombreEm;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombreEm() {
        return nombreEm;
    }

    public void setNombreEm(String nombreEm) {
        this.nombreEm = nombreEm;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nombre) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String clasificarSalario() {
        if (salario > 50000) {
            return "Alta";
        } else if (salario >= 10000) {
            return "Media";
        } else {
            return "Baja";
        }
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombreEm);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        System.out.println("Clasificacion salarial: "+clasificarSalario());
    }
}