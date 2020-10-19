package br.com.rogerio.app;

import br.com.rogerio.model.Fila_Ex;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class Fila_Teste {

    public static void main(String[] args) {
        Fila_Ex fila = new Fila_Ex(5);

        try {
            fila.enqueue(1);
            fila.enqueue(2);
            fila.enqueue(3);
            fila.enqueue(4);
            fila.enqueue(5);
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();
            System.out.println("Frente da Fila: " + fila.peek());
            
            
            
//            

        } catch (Exception erro) {
            System.out.println("\tAtenção!\n\t" +  erro.getMessage());
        }

    }

}
