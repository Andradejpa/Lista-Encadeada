package listaencadeada;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ListaEncadeada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Node n;
        List lista = new List();
        int op, numero;
        menu();
        op = entrada.nextInt();

        do {
            switch (op) {
                case 1:

                    System.out.println("Insira um numero natural na lista");
                    numero = entrada.nextInt();
                    lista.inserir(numero);
                    menu();
                    op = entrada.nextInt();
                    break;
                case 2:
                    System.out.println("Informe o elemento a ser procurado");
                    numero = entrada.nextInt();
                    if (lista.checkNum(numero) == true) {
                        System.out.println("Elemento encontrado");
                        menu();
                        op = entrada.nextInt();
                        break;
                    } else {
                        System.out.println("Elemento não encontrado");
                        menu();
                        op = entrada.nextInt();
                        break;
                    }
                case 3:
                    lista.show();
                    menu();
                    op = entrada.nextInt();
                    break;
            }
        } while (op != -1);

    }

    public static void menu() {
        System.out.println("-*-*-*-Lista Simplesmente Encadeada-*-*-*-");
        System.out.println();
        System.out.println(" 1 Para inserir ");
        System.out.println(" 2 Para Buscar");
        System.out.println("-1 Para sair");

    }

}
