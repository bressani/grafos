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
public class Node {

    Node cima, baixo, esquerda, direita;
    int valor;

    public Node(Node cima, Node baixo, Node esquerda, Node direita, int valor) {
        this.cima = cima;
        this.baixo = baixo;
        this.esquerda = esquerda;
        this.direita = direita;
        this.valor = valor;
    }

    public Node getCima() {
        return cima;
    }

    public void setCima(Node cima) {
        this.cima = cima;
    }

    public Node getBaixo() {
        return baixo;
    }

    public void setBaixo(Node baixo) {
        this.baixo = baixo;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
