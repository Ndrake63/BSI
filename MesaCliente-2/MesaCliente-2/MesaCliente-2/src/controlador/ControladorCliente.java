/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BD.BD_Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Cliente;

/**
 *
 * @author victorperes
 */
public class ControladorCliente {

    JTextField jTNome;
    JComboBox<String> jCMesa;
    JTextField jTP1P;
    JTextField jTP2P;
    JTextField jTP3P;
    JTextField jTP4P;

    JTextField jTP1Q;
    JTextField jTP2Q;
    JTextField jTP3Q;
    JTextField jTP4Q;
    JTextArea jTAInformacao;

    int ID_Global;
    
    ArrayList<Cliente> BDClientes = new ArrayList<>();

    BD_Cliente bd_cliente = new BD_Cliente();

    public ControladorCliente(JTextField jTNome, JComboBox<String> jCMesa, JTextField jTP1P, JTextField jTP2P, JTextField jTP3P, JTextField jTP4P, JTextField jTP1Q, JTextField jTP2Q, JTextField jTP3Q, JTextField jTP4Q, JTextArea jTAInformacao) {
        this.jTNome = jTNome;
        this.jCMesa = jCMesa;
        this.jTP1P = jTP1P;
        this.jTP2P = jTP2P;
        this.jTP3P = jTP3P;
        this.jTP4P = jTP4P;
        this.jTP1Q = jTP1Q;
        this.jTP2Q = jTP2Q;
        this.jTP3Q = jTP3Q;
        this.jTP4Q = jTP4Q;
        this.jTAInformacao = jTAInformacao;
    }

    public int novoID() {
        BDClientes = bd_cliente.carregarBanco();
        return BDClientes.size() + 1;
    }

    public void salvarCliente() {
        int id = novoID();
        String nome = jTNome.getText();
        int mesa = jCMesa.getSelectedIndex() + 1;

        //SALVAR
        Cliente cliente = new Cliente(id, nome, mesa, 0);

        BDClientes.add(cliente);

        bd_cliente.salvarBanco(BDClientes);
        
        ID_Global= id;
       
    }

    public void fazerPedido() {
        Cliente c = buscarCliente();
        c.setStatus(1);
        c.setP1P(Integer.parseInt(jTP1P.getText()));
        c.setP2P(Integer.parseInt(jTP2P.getText()));
        c.setP3P(Integer.parseInt(jTP3P.getText()));
        c.setP4P(Integer.parseInt(jTP4P.getText()));
        
        int index = 0;
        for (Cliente cli : BDClientes) {
            if(cli.getId()==ID_Global){
                break;
            }
            index++;
        }
        BDClientes.set(index, c);
        bd_cliente.salvarBanco(BDClientes);
        
        jTAInformacao.setText("===Pedido realizado===");
    }

    private Cliente buscarCliente() {
        BDClientes = bd_cliente.carregarBanco();
            for (Cliente cli : BDClientes){
                if(cli.getId()==ID_Global){
                    return cli;
                }
            }
            return null;
    }
}


