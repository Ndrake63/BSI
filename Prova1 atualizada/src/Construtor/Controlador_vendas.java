/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import BancoDados.BancoDadosVendas;
import Modelo.Cadastro_venda;
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
public class Controlador_vendas {
    JTextField jTextFieldId_venda;
    JTextField jTextFieldID_usuario;
    JTextField jTextFieldID_produto;
    JTextField jTextFieldQuantidade;
    JTextField jTextFieldValor;
    JList<String> jListVendas;
    JButton jButtonSalvarEditar;
    
    ArrayList<Cadastro_venda> BancoDadosVendas = new ArrayList<>();
    
    DefaultListModel listaTelaVenda = new DefaultListModel();
    
    BancoDadosVendas bancoVenda = new BancoDadosVendas();

    public Controlador_vendas(JTextField jTextFieldId_venda, JTextField jTextFieldID_usuario, JTextField jTextFieldID_produto, JTextField jTextFieldQuantidade, JTextField jTextFieldValor, JList<String> jListVendas, JButton jButtonSalvarEditar) {
        this.jTextFieldId_venda = jTextFieldId_venda;
        this.jTextFieldID_usuario = jTextFieldID_usuario;
        this.jTextFieldID_produto = jTextFieldID_produto;
        this.jTextFieldQuantidade = jTextFieldQuantidade;
        this.jTextFieldValor = jTextFieldValor;
        this.jListVendas = jListVendas;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        
        novoID();
        carregarLista();
    }
    public void novoID() {
        BancoDadosVendas = bancoVenda.carregarBanco();
        int tamanhoArray = BancoDadosVendas.size();
        jTextFieldID_usuario.setText((tamanhoArray + 1) + "");
        limpar();
    }
    
     public void limpar() {
        jTextFieldID_usuario.setText("");
        jTextFieldID_produto.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValor.setText("");
        
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
    public int pegarIndex(Cadastro_venda venda) {
        int index = 0;
        for(Cadastro_venda pro : BancoDadosVendas) {
            if(pro.getId_venda()== venda.getId_venda()) {
                break;
            }
            index++;
        }
        return index;
    }
      
    public void editar() {
        String temp = jListVendas.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Cadastro_venda usuarioEditar = buscar(id);
        
        jTextFieldId_venda.setText(usuarioEditar.getId_venda()+"");
        jTextFieldID_usuario.setText(usuarioEditar.getId_usuario()+"");
        jTextFieldID_produto.setText(usuarioEditar.getId_produto()+"");
        jTextFieldQuantidade.setText(usuarioEditar.getQuantidade()+"");
        jTextFieldValor.setText(usuarioEditar.getValor()+"");
        
        jButtonSalvarEditar.setText("Editar");
    }
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public Cadastro_venda buscar(int id) {
        for (Cadastro_venda venda01 : BancoDadosVendas) {
            if(venda01.getId_venda() == id) {
                return venda01;
            }
        }
        return null;
    }
    
    public void carregarLista() {
        listaTelaVenda = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Cadastro_venda venda01 : BancoDadosVendas) {
            ListaTelaAtualizada.add(venda01.getValor()+" ("+venda01.getId_venda()+")");
        }
        Collections.sort(ListaTelaAtualizada);
        listaTelaVenda.addAll(ListaTelaAtualizada);
        jListVendas.setModel(listaTelaVenda);
    }
    public void fundoBranco(){
        jTextFieldId_venda.setBackground(Color.white);
        jTextFieldID_usuario.setBackground(Color.white);
        jTextFieldID_produto.setBackground(Color.white);
        jTextFieldQuantidade.setBackground(Color.white);
        jTextFieldValor.setBackground(Color.white);
    }
    
    public void salvarEditarVenda() {
        String nId_venda = jTextFieldId_venda.getText();
        String Id_usuario = jTextFieldID_usuario.getText();
        String Id_produto = jTextFieldID_produto.getText();
        String Quantidade = jTextFieldQuantidade.getText();
        String Valor = jTextFieldValor.getText();
 
        fundoBranco();
        boolean verificador = true;
        
        if (campoVazio(Id_usuario)) {
            JOptionPane.showMessageDialog(null, "O campo ID usuário não poder ser vazio");
            jTextFieldID_usuario.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(Id_produto)) {
            JOptionPane.showMessageDialog(null, "O campo ID produto não poder ser vazio");
            jTextFieldID_produto.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(Quantidade)) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade não poder ser vazio");
            jTextFieldQuantidade.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(Valor)) {
            JOptionPane.showMessageDialog(null, "O campo Valor não poder ser vazio");
            jTextFieldValor.setBackground(Color.red);
            verificador = false;
        
        
        }else if(verificarTipoint(Id_produto)){
            JOptionPane.showMessageDialog(null, "O campo ID produto tem que ser Int");
            jTextFieldID_produto.setBackground(Color.red);
        }else if(verificarTipoint(Id_usuario)){
            JOptionPane.showMessageDialog(null, "O campo ID usuario tem que ser Int");
            jTextFieldID_usuario.setBackground(Color.red);
        }else if(verificarTipoint(Quantidade)){
            JOptionPane.showMessageDialog(null, "O campo Quantidade tem que ser Int");
            jTextFieldID_produto.setBackground(Color.red);
        }else if(verificarTipoFloat(Valor)){
            JOptionPane.showMessageDialog(null, "O campo Valor tem que ser Float");
            jTextFieldValor.setBackground(Color.red);
        }
        
        
        if(verificador) {
            //SALVAR
            Cadastro_venda venda = new Cadastro_venda(Integer.parseInt(nId_venda), Integer.parseInt(Id_usuario), Integer.parseInt(Id_produto), Integer.parseInt(Quantidade), Float.parseFloat(Valor));

            
            if (jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
                BancoDadosVendas.add(venda);
            } else {
                int index = pegarIndex(venda);
                BancoDadosVendas.set(index, venda);
            }
            bancoVenda.salvarBanco(BancoDadosVendas);
            carregarLista();
            novoID();
        }
    }
}
