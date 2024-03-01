public class ImpresoraCanon extends Impresora{
    private double tintaColor;

    public ImpresoraCanon(String modelo, String tipoDeConexion, String fechaDeFabricacion, int hojasDisponibles, double porcentajeTinta, double tintaColor) {
        super(modelo, tipoDeConexion, fechaDeFabricacion, hojasDisponibles, porcentajeTinta);
        this.tintaColor = tintaColor;
    }


    @Override
    public String imprimir() {
        if(super.getHojasDisponibles() > 0 && super.getPorcentajeTinta() > 1.00 || tintaColor > 1.00 )
        {
            return "La impresora epson ha impreso en Blanco y Negro";
        }else {
            return "Fijate las hojas o el porcentaje de tinta";
        }
    }
    @Override
    public boolean necesitaTinta(){
        return tintaColor > 1.00 || super.getPorcentajeTinta() > 1.00;
    }
}
