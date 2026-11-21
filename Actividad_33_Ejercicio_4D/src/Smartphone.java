public class Smartphone implements ReproductorMusica, Camara, NavegadorWeb {
    private String marca;
    private String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    private boolean atributosValidos() {
        return marca != null && !marca.trim().isEmpty() &&
                modelo != null && !modelo.trim().isEmpty();
    }

    public void reproducirMusica() {
        if (atributosValidos()) {
            System.out.println("Reproduciendo música en el " + marca + " " + modelo);
        } else {
            System.out.println("Error: Marca o modelo inválidos para reproducir música.");
        }
    }

    public void tomarFoto() {
        if (atributosValidos()) {
            System.out.println("Tomando foto con el " + marca + " " + modelo);
        } else {
            System.out.println("Error: Marca o modelo inválidos para tomar foto.");
        }
    }

    public void abrirPaginaWeb(String url) {
        if (atributosValidos() && url != null && !url.trim().isEmpty()) {
            System.out.println("Abriendo " + url + " en el " + marca + " " + modelo);
        } else {
            System.out.println("Error: Datos inválidos para abrir página web.");
        }
    }
}
