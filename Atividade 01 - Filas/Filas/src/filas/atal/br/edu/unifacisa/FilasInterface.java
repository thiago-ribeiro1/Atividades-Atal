package filas.atal.br.edu.unifacisa;

public interface FilasInterface<T> {

    // 'T' representa um tipo genérico, permitindo que a interface funcione com diferentes tipos de dados
    boolean offer(T e);

    void add(T e);

    T remove();

    T peek();

    T poll();
}
