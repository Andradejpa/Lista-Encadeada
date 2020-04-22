package listaencadeada;

/**
 *
 * @author Joao Pedro
 */
public class List {

    private Node First;
    private Node Last;
    private int qtd;

    public void inserir(int numero) {
        Node n = new Node(numero);
        if (this.qtd == 0) {
            inserirPrimeiro(n);
        } else if (numero < this.First.getInfo()) {
            inserirInicio(n);
        } else if (numero > this.Last.getInfo()) {
            inserirFinal(n);
        } else {
            inserirMeio(n);
        }

    }

    private void inserirMeio(Node n) {
        Node ant = First; //Referencia para o primeiro nó
        Node prev = First.getNext();//referencia para o segundo nó ápos o primeiro 

        while (prev != null) {
            ant.setNext(n);
            n.setNext(prev);
            this.qtd++;
            return;
        }
    }

    private void inserirPrimeiro(Node n) {
        this.First = n;
        this.Last = n;
        this.qtd++;
        return;

    }

    private void inserirInicio(Node n) {
        n.setNext(First);
        First = n;
        this.qtd++;
        return;
    }

    private void inserirFinal(Node n) {
        Last.setNext(n);
        Last = n;
        this.qtd++;
        return;

    }

    public boolean checkNum(int numero) {
        Node aux = First;
        if (numero < this.First.getInfo()) {
            return false;
        } else if (numero > this.First.getInfo()) {
            return false;
        } else {
            while (aux != null) {
                if (aux.getInfo() == numero) {
                    return true;
                }
                aux = aux.getNext();
            }

        }
        return false;
    }

    public void show() {
        Node aux = First;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }

    }

}
