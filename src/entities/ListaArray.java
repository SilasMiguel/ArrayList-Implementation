package entities;

import java.util.Arrays;

public class ListaArray<T> implements Lista<T> {
    private int tamanhoDaLista = 0;
    private T[] lista;

    @SuppressWarnings("unchecked")
    public ListaArray() {
        this.lista = (T[]) new Object[tamanhoDaLista];
    }

    @Override
    public void adicionar(T elemento) {
        if (tamanhoDaLista == 0) {
            tamanhoDaLista = 1;
            lista = Arrays.copyOf(lista, tamanhoDaLista);
        }

        if (tamanhoDaLista > lista.length) {
            lista = Arrays.copyOf(lista, lista.length * 2);
        }
        
        this.lista[tamanhoDaLista - 1] = elemento;

        tamanhoDaLista++;
    }

    @Override
    public void remover(Object o) {

    }

    @Override
    public void remover(int index) {
        int proximo = index + 1;

        for (int i = index; i < tamanhoDaLista; i++) { // Lógica para realocar os elementos seguintes ao excluido
            lista[i] = lista[proximo];
            lista[proximo] = lista[proximo + 1];
            proximo++;
        }
        tamanhoDaLista--;
    }

    @Override
    public int tamanho() {
        return tamanhoDaLista - 1;
    }

    @Override
    public T obter() {
        return null;
    }

    @Override
    public String toString() {
        String listaToString = Arrays.toString(lista);

        if (lista[tamanhoDaLista] == null) { // Verificação para não imprimir os valores nulos que o usuário não adicionou
                                             // Ou seja, não imprimir os nulos gerados pela duplicação de tamanho

            listaToString = Arrays.toString( Arrays.copyOf(lista, tamanhoDaLista - 1) );
        }
        return listaToString;
    }
}
