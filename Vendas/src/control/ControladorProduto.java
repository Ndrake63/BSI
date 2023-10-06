/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BancoDados.BancoDadosProduto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cliente;
import model.Produto;

/**
 *
 * @author alunos
 */
public class ControladorProduto {
    JTextField jTextfieldID;
    JTextField jTextFieldNome;
    JTextField jTextFieldQuantidade;
    JTextField jTextFieldValor;
    JList<String> jListProduto;
    JButton jButtonSalvarEditar;

    ArrayList<Produto> BancoDadosProduto = new ArrayList<>();
    
    DefaultListModel listaTelaProduto = new DefaultListModel();
    
    BancoDadosProduto bancoProduto = new BancoDadosProduto();
    
    public ControladorProduto(JTextField jTextfieldID, JTextField jTextFieldNome, JTextField jTextFieldQuantidade, JTextField jTextFieldValor, JList<String> jListProduto, JButton jButtonSalvarEditar) {
        this.jTextfieldID = jTextfieldID;
        this.jTextFieldNome = jTextFieldNome;
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
        jTextfieldID.setText((tamanhoArray + 1) + "");
        limpar();
    }
    
    public void limpar() {
        jTextFieldNome.setText("");
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
    
    public int pegarIndex(Produto produto) {
        int index = 0;
        for(Produto pro : BancoDadosProduto) {
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
        Produto produtoEditar = buscar(id);
        
        jTextfieldID.setText(produtoEditar.getId()+"");
        jTextFieldNome.setText(produtoEditar.getNome());
        jTextFieldQuantidade.setText(produtoEditar.getQuantidade()+"");
        jTextFieldValor.setText(produtoEditar.getValor()+"");
        
        jButtonSalvarEditar.setText("Editar");
    }
    
    public boolean campoVazio(String temp) {
        return temp.isEmpty();
    }
    
    public Produto buscar(int id) {
        for (Produto produto01 : BancoDadosProduto) {
            if(produto01.getId() == id) {
                return produto01;
            }
        }
        return null;
    }
    
    public void carregarLista() {
        listaTelaProduto = new DefaultListModel();
        ArrayList<String> ListaTelaAtualizada = new ArrayList<>();
        for (Produto produto01 : BancoDadosProduto) {
            ListaTelaAtualizada.add(produto01.getNome()+" ("+produto01.getId()+")");
        }
        Collections.sort(ListaTelaAtualizada);
        listaTelaProduto.addAll(ListaTelaAtualizada);
        jListProduto.setModel(listaTelaProduto);
    }
    public void fundoBranco(){
        jTextFieldNome.setBackground(Color.white);
        jTextFieldQuantidade.setBackground(Color.white);
        jTextFieldValor.setBackground(Color.white);
    }
    
    public void salvarEditarProduto() {
        String nId = jTextfieldID.getText();
        String nome = jTextFieldNome.getText();
        String quantidade = jTextFieldQuantidade.getText();
        String valor = jTextFieldValor.getText();
        
        fundoBranco();
        boolean verificador = true;
        
        if (campoVazio(nome)) {
            JOptionPane.showMessageDialog(null, "O campo Nome não poder ser vazio");
            jTextFieldNome.setBackground(Color.red);
            verificador = false;
        }else if (campoVazio(quantidade)) {
            JOptionPane.showMessageDialog(null, "O campo Quantidade não poder ser vazio");
            jTextFieldQuantidade.setBackground(Color.red);
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
            Produto produto = new Produto(Integer.parseInt(nId), nome, Integer.parseInt(quantidade), Float.parseFloat(valor));

            
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
