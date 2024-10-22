package filas.atal.br.edu.unifacisa;

import java.util.LinkedList;
import java.util.Queue;

public class Filas<T> implements FilasInterface<T> {
    private Queue<T> fila = new LinkedList<>();
    private int tamanhoFila = 10;

    @Override
    public boolean offer(T e) {
        if (fila.size() < tamanhoFila) {
            return fila.offer(e);
        }
        else {
            System.out.println("Fila cheia!");
            return false;
        }
    }

    @Override
    public void add(T e) {
        if (fila.size() < tamanhoFila) {
            fila.add(e);
        }
        else {
            throw new IllegalStateException("Fila cheia!");
        }
    }

    @Override
    public T remove() {
        return fila.remove();
    }

    @Override
    public T peek() {
        return fila.peek();
    }

    @Override
    public T poll() {
        return fila.poll();
    }

    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("Elementos na fila: " + fila);
        }
    }
}

