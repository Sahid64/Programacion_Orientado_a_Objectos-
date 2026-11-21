public class Tiempo {
    public int horas;
    public int minutos;
    public int segundos;

    public Tiempo(int horas,int minutos,int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void mostrarTiempo(){
        System.out.println("Mostrando tiempo ingresado");
        while (segundos>59){
            segundos -=60;
            minutos +=1;
        }
        while (minutos>59){
            minutos -=60;
            horas +=1;
        }
        System.out.println("El tiempo ingresado es de...  "+horas+":"+minutos+":"+segundos);
    }
    public void sumarTiempo(int h,int m, int s){
        horas += h;
        minutos += m;
        segundos += s;
        while (segundos>59){
            segundos -=60;
            minutos +=1;
        }
        while (minutos>59){
            minutos -=60;
            horas +=1;
        }
        System.out.println("El tiempo actual es de:  "+horas+":"+minutos+":"+segundos);
    }
}