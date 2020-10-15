package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class Fila_Ex {

    private int tamanho;
    private int inicio;
    private int fim;
    private int array[];
    private int quantDeElementos;

    public Fila_Ex() {
        this(10);
    }

    public Fila_Ex(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior que zero\n");
        }
        this.tamanho = tamanho;
        this.array = new int[tamanho];
        inicio = 0;
        fim = 0;
        quantDeElementos = 0;
    }

    public boolean isEmpty() {
        return quantDeElementos == 0;
    }

    public boolean isFull() {
       return quantDeElementos == array.length;
       
    }

    public int size() {
        return quantDeElementos;
    }

    public void enqueue(int elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia!\n");
        }
        array[fim] = elemento;
        fim = (fim + 1) % array.length;
        quantDeElementos++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!\n");
        }
        inicio = (inicio + 1) % array.length;
        quantDeElementos--;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!\n");
        }
        return array[inicio];
    }

    public void destroy() {
        inicio = 0;
        fim = 0;
        quantDeElementos = 0;
    }
}
