/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author MOISES
 */
public class Cadastro_venda implements Serializable{
    int id_venda;
    int id_usuario;
    int id_produto;
    int quantidade;
    float valor;

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cadastro_venda() {
    }

    public Cadastro_venda(int id_venda, int id_usuario, int id_produto, int quantidade, float valor) {
        this.id_venda = id_venda;
        this.id_usuario = id_usuario;
        this.id_produto = id_produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    
}
