public class Libro {
    private String titulo;
    private String autor;
    private int anioPubli;

    public Libro(String titulo, String autor, int anioPubli){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPubli = anioPubli;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String s){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String s){
        this.autor = autor;
    }
    public int getAnioPubli(){
        return anioPubli;
    }
    public void setAnioPubli(int anioPubli){
        this.anioPubli = anioPubli;
    }
    public  void verificarAnio(){
        if (anioPubli<2000){
            System.out.println("El libro fue publicado antes del año 2000.");
        } else {
            System.out.println("El libro fue publicado despues del año 2000.");
        }
    }
}