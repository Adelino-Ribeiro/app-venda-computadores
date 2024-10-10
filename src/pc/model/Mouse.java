package pc.model;

public class Mouse extends DispositivoEntrada {

    private final int idMouse;

    private static int countMouses;

    public Mouse(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idMouse = ++countMouses;

    }

    @Override
    public String toString() {
        return "Mouse [idMouse=" + idMouse + "] " + super.toString();
    }
}
