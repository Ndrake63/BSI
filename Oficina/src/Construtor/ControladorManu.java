/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import BancoDeDados.BD_carros;
import BancoDeDados.BD_manutencao;
import Modelo.Carro;
import Modelo.Manutencao;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alunos
 */
public class ControladorManu {
    JTextField JTid;
    JTextField JTidcarro;
    JTextField JTplaca;
    JTextField JTkm;
    JTextField JTultimakm;
    JButton JBSalvarRemover;
    
    JList<String> jListCarro;
    JList<String> jListManu;
    
    ArrayList<Carro> BDcarros = new ArrayList<>();
    ArrayList<Manutencao> BDmanu = new ArrayList<>();

    
    DefaultListModel listaTelaCarro = new DefaultListModel();
    DefaultListModel listaTelaManu = new DefaultListModel();
    
    BD_carros bd = new BD_carros();
    BD_manutencao bdManu = new BD_manutencao();

    public ControladorManu(JTextField JTid, JTextField JTidcarro, JTextField JTplaca, JTextField JTkm, JTextField JTultimakm, JButton JBSalvarRemover, JList<String> jListCarro, JList<String> jListManu) {
        this.JTid = JTid;
        this.JTidcarro = JTidcarro;
        this.JTplaca = JTplaca;
        this.JTkm = JTkm;
        this.JTultimakm = JTultimakm;
        this.JBSalvarRemover = JBSalvarRemover;
        this.jListCarro = jListCarro;
        this.jListManu = jListManu;
        
        BDcarros = bd.carregarBanco();
        carregarlistaCarro();
        
        BDmanu = bdManu.carregarBanco();
        
        novoid();

    }
    public void novoid(){
        BDcarros = bd.carregarBanco();
        BDmanu = bdManu.carregarBanco();
        int tamanhoArray = BDmanu.size();
        JTid.setText((tamanhoArray+1)+"");
        JTidcarro.setText("");
        JTplaca.setText("");
        JTkm.setText("");
        
        carregarlistaCarro();
    }
    
    public void carregarlistaCarro(){
        listaTelaCarro = new DefaultListModel();
        
        ArrayList<String> ListaTelaAtualizar = new ArrayList<>();
        
        for (Carro carro1 : BDcarros) {
            ListaTelaAtualizar.add(carro1.getPlaca()+ " ("+carro1.getId()+")");
        }
        
        Collections.sort(ListaTelaAtualizar);
        
        listaTelaCarro.addAll(ListaTelaAtualizar);
        
        jListCarro.setModel(listaTelaCarro);
    }
    public void selecionarCarro(){
        
        String temp = jListCarro.getSelectedValue();
        
        int indexInicioConsulta = temp.indexOf("(",2);
        int indexFinalConsulta = temp.indexOf(")",2);
        
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        
        int id = Integer.parseInt(res);
        
        Carro carroselecionado = buscarcarro(id);
        
        JTidcarro.setText(carroselecionado.getId()+"");
        JTplaca.setText(carroselecionado.getPlaca());
        JTkm.setText((carroselecionado.getKm()+""));
        
        // JBSalvarEditar.setText("Editar");
        
    }
    public Carro buscarcarro(int id){
        for (Carro carro1 : BDcarros) {
            if(carro1.getId()==id){
                return carro1;
            }
            
        }
        return null;
    }
    
    public void salvarManu(){
        String nid = JTid.getText();
        String nidcarro = JTidcarro.getText();
        
        Carro car = buscarcarro(Integer.parseInt(nidcarro));

            //SALVAR
            
            Manutencao manu = new Manutencao(Integer.parseInt(nid), car.getKm(), car);
            
            BDmanu.add(manu);
            
            bdManu.salvarBanco(BDmanu);
            
            novoid();
            
            
        }

 
}