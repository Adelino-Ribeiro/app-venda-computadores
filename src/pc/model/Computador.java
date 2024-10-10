package pc.model;

public class Computador {

    private int idComputador;

    private String nome;

    private Monitor monitor;

    private Teclado teclado;

    private Mouse mouse;

    private static int countComputadores;

    private Computador () {
        idComputador = ++countComputadores;
    }

    public Computador(String nome, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nome = nome;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return 
        "Computador [\n \tidComputador = " + idComputador 
        + ",\n \tNome = " + nome 
        + ",\n \t" + monitor 
        + ",\n \t" + teclado 
        + ",\n \t" + mouse 
        + "\n]";
    }

    

}
