public class Clase {
    private String nombre;
    private String matricula;
    private double calificacionParcial1;
    private double calificacionParcial2;
    private double calificacionParcial3;

    public Clase(String nombre,String matricula,double calificacionParcial1,double calificacionParcial2,double calificacionParcial3){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacionParcial2 = calificacionParcial1;
        this.calificacionParcial2 = calificacionParcial2;
        this.calificacionParcial3 = calificacionParcial3;
    }

    //Todos los get y set
    public String getNombre() {return nombre;}
    public String getMatricula() {return matricula;}
    public double getCalificacion1() {return calificacionParcial1;}
    public double getCalificacion2() {return calificacionParcial2;}
    public double getCalificacion3() {return calificacionParcial3;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setCalificacion1(double calificacion1) {this.calificacionParcial1 = calificacionParcial1;}
    public void setCalificacion2(double calificacion2) {this.calificacionParcial2 = calificacionParcial2;}
    public void setCalificacion3(double calificacion3) {this.calificacionParcial3 = calificacionParcial3;}

    public void calcularPromedioFinal(){
        double pro = (calificacionParcial1+calificacionParcial2+calificacionParcial3);
        double promedio = pro/2;
        System.out.println("Promedio final: "+ promedio);
    }
    public void mostrarEvaluacion(){
        double pro = (calificacionParcial1+calificacionParcial2+calificacionParcial3);
        double promedio = pro/2;;
        if (promedio<5){
            System.out.println("Resultado: Reprobado");
        }
        if (promedio>5&&promedio<8){
            System.out.println("Resultado: Muy bien");
        }
        if (promedio>=8&&promedio<10){
            System.out.println("Resultado: Excelente");
        }
        if (promedio==10){
            System.out.println("Resultado: ¡Felicidades! Calificacion Perfecta");
        }
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Matricula; "+matricula);
        System.out.println("Calificacion Parcial 1: "+calificacionParcial1);
        System.out.println("Calificacion Parcial 2: "+calificacionParcial2);
        System.out.println("Calificacion Parcial 3: "+calificacionParcial3);


    }




}




