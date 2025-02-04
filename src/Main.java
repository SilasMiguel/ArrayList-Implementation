import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> teste = new ArrayList<>();
        Lista<Integer> lista = new ListaArray<>();



        System.out.print("Digite a quantidade de vezes: ");

        int quantidade = sc.nextInt();

        int contador = 1;

        while(contador <= quantidade) {
            System.out.print("Adicionar o " + contador + "° elemento: ");
            lista.adicionar(sc.nextInt());

            contador++;
        }

        System.out.print("Escolhe um indice para remover: ");
        lista.remover(sc.nextInt());
        System.out.println(lista);

        System.out.println("tamanho da lista: " + lista.tamanho());

        lista.adicionar(11);
        lista.adicionar(null);
        System.out.println(lista);
        System.out.println("tamanho da lista: " + lista.tamanho());
        sc.close();
    }
}