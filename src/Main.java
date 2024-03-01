//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Impresora impresora1 = new ImpresoraEpson("Modelo1","Cable", "2020",1,10.00);
        impresora1.imprimir();
        System.out.println(impresora1.getHojasDisponibles());
    }
}