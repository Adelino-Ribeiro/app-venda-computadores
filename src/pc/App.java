package pc;

import pc.model.Computador;
import pc.model.Monitor;
import pc.model.Mouse;
import pc.model.Teclado;
import pc.servicos.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        
        //criar computador 1
        Mouse mouseLenovo = new Mouse("USB", "Lenovo");

        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");

        Monitor monitorLenovo = new Monitor("Lenovo", 27);

        Computador computadorLenovo = new Computador("Computador Lenovo", monitorLenovo, tecladoLenovo, mouseLenovo);
        
        //criar computador 2
        Mouse mouseDell= new Mouse("Bluetooth", "Dell");

        Teclado tecladoDell = new Teclado("USB", "Dell");

        Monitor monitorDell = new Monitor("Dell", 15);
    
        Computador computadorDell = new Computador("Computador Dell", monitorDell, tecladoDell, mouseDell);
        
        //criar computador 3
        Mouse mouseMac= new Mouse("Bluetooth", "Mac");

        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");

        Monitor monitorMac = new Monitor("Mac", 27);
    
        Computador computadorMac = new Computador("Computador Mac", monitorMac, tecladoMac, mouseMac);

        // Criar pedidos 1

        Pedido pedido1 = new Pedido();

        pedido1.addComputador(computadorLenovo);

        pedido1.addComputador(computadorDell);


        pedido1.mostrarPedido();

        // Criar pedidos 1

        Pedido pedido2 = new Pedido();

        pedido2.addComputador(computadorMac);
        
        pedido2.addComputador(computadorDell);
        
        pedido2.addComputador(computadorLenovo);

        pedido2.mostrarPedido();

    }
}
