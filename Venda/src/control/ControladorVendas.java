/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alunos
 */
public class ControladorVendas {
    JTextField nome;
    JTextField refri;
    JTextField pizza;
    JTextField salgado;
    JTextField pastel;
    JTextField torrada;
    JTextField doces;
    JTextField cafe;
    JTextArea saida;

    public ControladorVendas(JTextField nome, JTextField refri, JTextField pizza, JTextField salgado, JTextField pastel, JTextField torrada, JTextField doces, JTextField cafe, JTextArea saida) {
        this.nome = nome;
        this.refri = refri;
        this.pizza = pizza;
        this.salgado = salgado;
        this.pastel = pastel;
        this.torrada = torrada;
        this.doces = doces;
        this.cafe = cafe;
        this.saida = saida;
    }
    
    
    
}
