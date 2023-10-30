/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import BancoDados.BancoDadosUsuario;
import Modelo.Cadastro_usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MOISES
 */
public class Controlador_usuario {
    JTextField jTextFieldID_usuario;
    JTextField jTextFieldNome_usuario;
    JTextField jTextFieldPapel;
    JList<String> jListtUsuario;
    JButton jButtonSalvarEditar;
    
    ArrayList<Cadastro_usuario> BancoDadosUsuario = new ArrayList<>();
    
    DefaultListModel listaTelaUsuario = new DefaultListModel();
    
    BancoDadosUsuario bancoUsuario = new BancoDadosUsuario();

    public Controlador_usuario(JTextField jTextFieldID_usuario, JTextField jTextFieldNome_usuario, JTextField jTextFieldPapel, JList<String> jListtUsuario, JButton jButtonSalvarEditar) {
        this.jTextFieldID_usuario = jTextFieldID_usuario;
        this.jTextFieldNome_usuario = jTextFieldNome_usuario;
        this.jTextFieldPapel = jTextFieldPapel;
        this.jListtUsuario = jListtUsuario;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
    
    novoID();
    carregarLista();
    
    }
    public void novoID() {
        BancoDadosUsuario = bancoUsuario.carregarBanco();
        int tamanhoArray = BancoDadosUsuario.size();
        jTextFieldID_usuario.setText((tamanhoArray + 1) + "");
        limpar();
    }
    
     public void limpar() {
        jTextFieldNome_usuario.setText("");
        jTextFieldPapel.setText("");
        jButtonSalvarEditar.setText("Salvar");
        fundoBranco();
    }
    
      public boolean verificarTipoint(String x){
        try {
            int y = Integer.parseInt(x);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
      public boolean verificarTipoFloat(String x){
        try {
            float y = Float.parseFloat(x);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    public int pegarIndex(Cadastro_usuario usuario) {
        int index = 0;
        for(Cadastro_usuario pro : BancoDadosUsuario) {
            if(pro.getId() == usuario.getId()) {
                break;
            }
            index++;
        }
        return index;
    }
      
    public void editar() {
        String temp = jListtUsuario.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Cadastro_usuario usuarioEditar = buscar(id);
        
        jTextFieldID_usuario.setText(usuarioEditar.getId()+"");
        jTextFieldNome_usuario.setText(usuarioEditar.getNome());
        jTextFieldPapel.setText(usuarioEditar.getPapel()+"");
        
        jButtonSalvarEditar.setText("Editar");
    }
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public Cadastro_usuario buscar(int id) {
        for (Cadastro_usuario usuario01 : BancoDadosUsuario) {
            if(usuario01.getId() == id) {
                return usuario01;
            }
        }
        return null;
    }
    
    public void carregarLista() {
        listaTelaUsuario = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Cadastro_usuario usuario01 : BancoDadosUsuario) {
            ListaTelaAtualizada.add(usuario01.getNome()+" ("+usuario01.getId()+")");
        }
        Collections.sort(ListaTelaAtualizada);
        listaTelaUsuario.addAll(ListaTelaAtualizada);
        jListtUsuario.setModel(listaTelaUsuario);
    }
    public void fundoBranco(){
        jTextFieldNome_usuario.setBackground(Color.white);
        jTextFieldPapel.setBackground(Color.white);
    }
    
    public void salvarEditarUsuario() {
        String nId = jTextFieldID_usuario.getText();
        String nome = jTextFieldNome_usuario.getText();
        String papel = jTextFieldPapel.getText();
 
        fundoBranco();
        boolean verificador = true;
        
        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não poder ser vazio");
            jTextFieldNome_usuario.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(papel)) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade não poder ser vazio");
            jTextFieldPapel.setBackground(Color.red);
            verificador = false;
        
        }else if(verificarTipoint(papel)){
            JOptionPane.showMessageDialog(null, "O campo Quantidade tem que ser Int");
            jTextFieldPapel.setBackground(Color.red);
        }
        
        
        if(verificador) {
            //SALVAR
            Cadastro_usuario usuario = new Cadastro_usuario(Integer.parseInt(nId), nome, Integer.parseInt(papel));

            
            if (jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
                BancoDadosUsuario.add(usuario);
            } else {
                int index = pegarIndex(usuario);
                BancoDadosUsuario.set(index, usuario);
            }
            bancoUsuario.salvarBanco(BancoDadosUsuario);
            carregarLista();
            novoID();
        }
    }
}
    

