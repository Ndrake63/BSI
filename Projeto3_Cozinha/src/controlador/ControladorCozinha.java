/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BD.BD_Cliente;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Cliente;

/**
 *
 * @author victorperes
 */
public class ControladorCozinha {

    JTextField JTP1;
    JTextField JTP2;
    JTextField JTP3;
    JTextField JTP4;

    JList<String> JLPedidos;
   
    Cliente clienteEditar;
    
    ArrayList<Cliente> BDClientes = new ArrayList<>();

    BD_Cliente bd_cliente = new BD_Cliente();   
    
    DefaultListModel listaTelaPedido = new DefaultListModel();

    public ControladorCozinha(JTextField JTP1, JTextField JTP2, JTextField JTP3, JTextField JTP4, JList<String> JLPedidos) {
        this.JTP1 = JTP1;
        this.JTP2 = JTP2;
        this.JTP3 = JTP3;
        this.JTP4 = JTP4;
        this.JLPedidos = JLPedidos;
    }
    
    

    public void atualizando() {
        
        BDClientes = bd_cliente.carregarBanco();

        listaTelaPedido = new DefaultListModel();
        
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        
        for (Cliente cli : BDClientes) {
            if (cli.getStatus() == 1) {
                ListaTelaAtualizada.add(cli.getNome()+"- Mesa: "+cli.getMesa()+"("+cli.getId()+")");
                
            }
        }
        Collections.sort(ListaTelaAtualizada);
        
        listaTelaPedido.addAll(ListaTelaAtualizada);
        JLPedidos.setModel(listaTelaPedido);
    }

    public void editar() {
        String temp = JLPedidos.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        clienteEditar = buscar(id);
        JTP1.setText(clienteEditar.getP1P()+"");
        JTP2.setText(clienteEditar.getP2P()+"");
        JTP3.setText(clienteEditar.getP3P()+"");
        JTP4.setText(clienteEditar.getP4P()+"");
    }

    private Cliente buscar(int id) {
        for (Cliente cli : BDClientes) {
            if(cli.getId()==id){
                return cli;
            }
        }
        return null;
    }

    public void pronto() {
        clienteEditar.setStatus(2);
        clienteEditar.setP1Q(clienteEditar.getP1P()+clienteEditar.getP1Q());
        clienteEditar.setP2Q(clienteEditar.getP2P()+clienteEditar.getP2Q());
        clienteEditar.setP3Q(clienteEditar.getP3P()+clienteEditar.getP3Q());
        clienteEditar.setP4Q(clienteEditar.getP4P()+clienteEditar.getP4Q());
        
        clienteEditar.setP1P(0);
        clienteEditar.setP2P(0);
        clienteEditar.setP3P(0);
        clienteEditar.setP4P(0);
        
        
        
    }

}
