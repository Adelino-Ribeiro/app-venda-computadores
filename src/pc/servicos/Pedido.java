package pc.servicos;

import java.util.ArrayList;
import java.util.List;

import pc.model.Computador;

public class Pedido {

    private final int idOrdem;

    private final List<Computador> computadores;

    private static int countOrdens;

    public Pedido () {
        
        computadores = new ArrayList<>();
        
        this.idOrdem = ++countOrdens;
        
    }

    public void addComputador (Computador computador) {
        
        computadores.add(computador);

    }

    public void mostrarPedido (){

        System.out.println("Pedido #: " + idOrdem);
       
        System.out.println("Total de computadores: " + computadores.size());
       
        computadores.forEach(System.out::println);
    
    }

    

    

}
