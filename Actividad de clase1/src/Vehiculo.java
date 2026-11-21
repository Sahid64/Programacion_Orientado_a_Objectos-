class Vehiculo {
    private int numSerie;
    private String marca;
    private String modelo;

    public Vehiculo(int numSerie, String marca, String modelo) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.modelo = modelo;
    }
    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}