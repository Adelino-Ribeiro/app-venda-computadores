package pc.model;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;

    private static int countTeclado;

    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        this.idTeclado = ++countTeclado;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + "] " + super.toString();
    };

    

}
