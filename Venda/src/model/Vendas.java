/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Vendas {
    String nomeCliente;
    int refri;
    int pizza;
    int salgado;
    int pastel;
    int torrada;
    int doces;
    int cafe;
    float valor;

    public Vendas(String nomeCliente, int refri, int pizza, int salgado, int pastel, int torrada, int doces, int cafe, float valor) {
        this.nomeCliente = nomeCliente;
        this.refri = refri;
        this.pizza = pizza;
        this.salgado = salgado;
        this.pastel = pastel;
        this.torrada = torrada;
        this.doces = doces;
        this.cafe = cafe;
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getRefri() {
        return refri;
    }

    public void setRefri(int refri) {
        this.refri = refri;
    }

    public int getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        this.pizza = pizza;
    }

    public int getSalgado() {
        return salgado;
    }

    public void setSalgado(int salgado) {
        this.salgado = salgado;
    }

    public int getPastel() {
        return pastel;
    }

    public void setPastel(int pastel) {
        this.pastel = pastel;
    }

    public int getTorrada() {
        return torrada;
    }

    public void setTorrada(int torrada) {
        this.torrada = torrada;
    }

    public int getDoces() {
        return doces;
    }

    public void setDoces(int doces) {
        this.doces = doces;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
