/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import BancoDados.BancoDadosProduto;
import Modelo.Cadastro_produto;
import Visao.Cadastrar_produto;
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
public class Controlador_produto {
    JTextField jTextFieldID_produto;
    JTextField jTextFieldNome_produto;
    JTextField jTextFieldDescricao;
    JTextField jTextFieldQuantidade;
    JTextField jTextFieldValor;
    JList<String> jListProduto;
    JButton jButtonSalvarEditar;
    
    ArrayList<Cadastro_produto> BancoDadosProduto = new ArrayList<>();
    
    DefaultListModel listaTelaProduto = new DefaultListModel();
    
    BancoDadosProduto bancoProduto = new BancoDadosProduto();

    public Controlador_produto(JTextField jTextFieldID_produto, JTextField jTextFieldNome_produto, JTextField jTextFieldDescricao, JTextField jTextFieldQuantidade, JTextField jTextFieldValor, JList<String> jListProduto, JButton jButtonSalvarEditar) {
        this.jTextFieldID_produto = jTextFieldID_produto;
        this.jTextFieldNome_produto = jTextFieldNome_produto;
        this.jTextFieldDescricao = jTextFieldDescricao;
        this.jTextFieldQuantidade = jTextFieldQuantidade;
        this.jTextFieldValor = jTextFieldValor;
        this.jListProduto = jListProduto;
        this.jButtonSalvarEditar = jButtonSalvarEditar;
        
        novoID();
        carregarLista();
    }
    public void novoID() {
        BancoDadosProduto = bancoProduto.carregarBanco();
        int tamanhoArray = BancoDadosProduto.size();
        jTextFieldID_produto.setText((tamanhoArray + 1) + "");
        limpar();
    }
    
     public void limpar() {
        jTextFieldNome_produto.setText("");
        jTextFieldDescricao.setText("");
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
    public int pegarIndex(Cadastro_produto produto) {
        int index = 0;
        for(Cadastro_produto pro : BancoDadosProduto) {
            if(pro.getId() == produto.getId()) {
                break;
            }
            index++;
        }
        return index;
    }
      
    public void editar() {
        String temp = jListProduto.getSelectedValue();
        int indexInicioConsulta = temp.indexOf("(", 2);
        int indexFinalConsulta = temp.indexOf(")", 2);
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        int id = Integer.parseInt(res);
        Cadastro_produto produtoEditar = buscar(id);
        
        jTextFieldID_produto.setText(produtoEditar.getId()+"");
        jTextFieldNome_produto.setText(produtoEditar.getNome());
        jTextFieldDescricao.setText(produtoEditar.getDescricao());
        jTextFieldQuantidade.setText(produtoEditar.getQuantidade()+"");
        jTextFieldValor.setText(produtoEditar.getValor()+"");
        
        jButtonSalvarEditar.setText("Editar");
    }
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public Cadastro_produto buscar(int id) {
        for (Cadastro_produto produto01 : BancoDadosProduto) {
            if(produto01.getId() == id) {
                return produto01;
            }
        }
        return null;
    }
    
    public void carregarLista() {
        listaTelaProduto = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Cadastro_produto produto01 : BancoDadosProduto) {
            ListaTelaAtualizada.add(produto01.getNome()+" ("+produto01.getId()+")");
        }
        Collections.sort(ListaTelaAtualizada);
        listaTelaProduto.addAll(ListaTelaAtualizada);
        jListProduto.setModel(listaTelaProduto);
    }
    public void fundoBranco(){
        jTextFieldNome_produto.setBackground(Color.white);
        jTextFieldDescricao.setBackground(Color.white);
        jTextFieldQuantidade.setBackground(Color.white);
        jTextFieldValor.setBackground(Color.white);
    }
    
    public void salvarEditarProduto() {
        String nId = jTextFieldID_produto.getText();
        String nome = jTextFieldNome_produto.getText();
        String descricao = jTextFieldDescricao.getText();
        String quantidade = jTextFieldQuantidade.getText();
        String valor = jTextFieldValor.getText();
        
        fundoBranco();
        boolean verificador = true;
        
        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não poder ser vazio");
            jTextFieldNome_produto.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(quantidade)) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade não poder ser vazio");
            jTextFieldQuantidade.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(descricao)) {
            JOptionPane.showMessageDialog(null, "O campo Descricão não poder ser vazio");
            jTextFieldDescricao.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(valor)) {
            JOptionPane.showMessageDialog(null, "O campo Valor não poder ser vazio");
            jTextFieldValor.setBackground(Color.red);
            verificador = false;
        }else if(verificarTipoint(quantidade)){
            JOptionPane.showMessageDialog(null, "O campo Quantidade tem que ser Int");
            jTextFieldQuantidade.setBackground(Color.red);
        }else if(verificarTipoFloat(valor)){
            JOptionPane.showMessageDialog(null, "O campo Valor tem que ser Float");
            jTextFieldValor.setBackground(Color.red);
        }
        
        
        if(verificador) {
            //SALVAR
            Cadastro_produto produto = new Cadastro_produto(Integer.parseInt(nId), nome, descricao, Integer.parseInt(quantidade), Float.parseFloat(valor));

            
            if (jButtonSalvarEditar.getText().compareToIgnoreCase("Salvar") == 0) {
                BancoDadosProduto.add(produto);
            } else {
                int index = pegarIndex(produto);
                BancoDadosProduto.set(index, produto);
            }
            bancoProduto.salvarBanco(BancoDadosProduto);
            carregarLista();
            novoID();
        }
    }
}
