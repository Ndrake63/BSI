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
public class Cadastro_usuario implements Serializable{
    int id;
    String nome;
    int papel;

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

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public Cadastro_usuario() {
    }

    public Cadastro_usuario(int id, String nome, int papel) {
        this.id = id;
        this.nome = nome;
        this.papel = papel;
    }
    
}
