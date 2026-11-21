public class Clase {
    private String nombre;
    private String matricula;
    private double cali1;
    private double cali2;
    private double cali3;

    public Clase(String nombre,String matricula,double cali1, double cali2, double cali3){
        this.nombre=nombre;
        this.matricula=matricula;
        this.cali1=cali1;
        this.cali2=cali2;
        this.cali3=cali3;
    }

    public String getNombre(){return nombre;}
    public String getMatricula(){return matricula;}
    public double getCali1(){return cali1;}
    public double getCali2(){return cali2;}
    public double getCali3(){return cali3;}

    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMatricula(String matricula){this.matricula=matricula;}
    public void setCali1(double cali1){this.cali1=cali1;}
    public void setCali2(double cali2){this.cali1=cali2;}
    public void setCali3(double cali3){this.cali1=cali3;}

    public void calcularPromedioFinal(){
        double promedio = (cali1+cali2+cali3)/3;
        System.out.println("Promedio final: "+promedio);
    }
    public void mostrarEvaluacion(){
        double promedio = (cali1+cali2+cali3)/3;
        if (promedio==10){
            System.out.println("Resultado: Felicidades! Calificación Perfecta");
        }
        if (promedio>=8){
            if (promedio<10){
                System.out.println("Resultado: Excelente");
            }
        }
        if (promedio>=5){
            if (promedio<8){
                System.out.println("Resultado: Muy bien");
            }
        }
        if (promedio<5){
            System.out.println("Reprobado");
        }
    }

    public void mostrarinformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Matricula: "+matricula);
        System.out.println("Calificación Parcial 1: "+cali1);
        System.out.println("Calificación Parcial 2: "+cali2);
        System.out.println("Calificación Parcial 3: "+cali3);
    }
}
