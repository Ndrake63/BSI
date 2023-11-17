/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author alunos
 */
public class Cliente implements Serializable{
    int id; 
    String nome;
    int mesa; // Iniciando na mesa 1
    int p1Q;
    int p2Q;
    int p3Q;
    int p4Q;
    int p1P;
    int p2P;
    int p3P;
    int p4P;
    int status;

    public Cliente(int id, String nome, int mesa, int status) {
        this.id = id;
        this.nome = nome;
        this.mesa = mesa;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getP1Q() {
        return p1Q;
    }

    public void setP1Q(int p1Q) {
        this.p1Q = p1Q;
    }

    public int getP2Q() {
        return p2Q;
    }

    public void setP2Q(int p2Q) {
        this.p2Q = p2Q;
    }

    public int getP3Q() {
        return p3Q;
    }

    public void setP3Q(int p3Q) {
        this.p3Q = p3Q;
    }

    public int getP4Q() {
        return p4Q;
    }

    public void setP4Q(int p4Q) {
        this.p4Q = p4Q;
    }

    public int getP1P() {
        return p1P;
    }

    public void setP1P(int p1P) {
        this.p1P = p1P;
    }

    public int getP2P() {
        return p2P;
    }

    public void setP2P(int p2P) {
        this.p2P = p2P;
    }

    public int getP3P() {
        return p3P;
    }

    public void setP3P(int p3P) {
        this.p3P = p3P;
    }

    public int getP4P() {
        return p4P;
    }

    public void setP4P(int p4P) {
        this.p4P = p4P;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    
    
    
}
