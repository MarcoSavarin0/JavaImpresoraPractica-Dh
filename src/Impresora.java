public abstract class Impresora {
    private String modelo;
    private String tipoDeConexion;
    private String fechaDeFabricacion;
    private int hojasDisponibles;
    private  double porcentajeTinta;

    public Impresora(String modelo, String tipoDeConexion, String fechaDeFabricacion, int hojasDisponibles, double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    public boolean tienePapel(){
        return hojasDisponibles > 0;
    }
    public boolean necesitaTinta(){
        return porcentajeTinta > 1.00;
    }
    public abstract String imprimir();

}
