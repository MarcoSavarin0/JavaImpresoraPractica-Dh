public class ImpresoraEpson extends Impresora {

    public ImpresoraEpson(String modelo, String tipoDeConexion, String fechaDeFabricacion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoDeConexion, fechaDeFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir() {
        if(super.getHojasDisponibles() > 0 && super.getPorcentajeTinta() > 1.00)
        {
            super.setHojasDisponibles(super.getHojasDisponibles() - 1);
            super.setPorcentajeTinta(super.getPorcentajeTinta() - 1.00);
            return "La impresora epson ha impreso en Blanco y Negro";
        }else {
            return "Fijate las hojas o el porcentaje de tinta";
        }

    }
}
