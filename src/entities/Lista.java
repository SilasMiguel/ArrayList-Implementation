package entities;

public interface Lista<T> {
    void adicionar(T elemento);
    void remover(Object o);
    void remover(int index);
    int tamanho();
    T obter();
}
