/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author venator
 */
public class Lista {

    int tamanho;
    Node node;

    public Lista(int valor) {
        node = new Node(null, null, null, null, valor);

    }

    public void ligarY(int valor) {
        Node novo = new Node(node, null, null, null, valor);
        node.baixo = novo;
        node = novo;
    }

    public void mostrarY() {
        for (Node a = node; node != null; node = node.cima) {
            System.out.println(node.getValor());
        }
    }

    public void mostrarX(int valor) {
        boolean flag = true;
        while (node.valor != valor && flag) {
            //if() huehueuhaushd
        }

    }
}
