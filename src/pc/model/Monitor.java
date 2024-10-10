package pc.model;

public class Monitor {

    private final int idMonitor;

    private String marca;

    private double tamanho;

    private static int countMonitor;

    private Monitor() {
        this.idMonitor = ++countMonitor;
    }

    public Monitor(String marca, double tamanho) {
        this();
        this.marca = marca;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanho=" + tamanho + "]";
    }

    

    
}
