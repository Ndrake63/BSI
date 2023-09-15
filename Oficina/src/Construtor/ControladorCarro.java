/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import BancoDeDados.BD_carros;
import Modelo.Carro;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author alunos
 */
public class ControladorCarro {
    JTextField JTid;
    JTextField JTplaca;
    JTextField JTkm;
    JButton JBSalvarEditar;
    
    JList<String> JListCarro;
    
    ArrayList<Carro> BDcarros = new ArrayList<>();
    
    DefaultListModel listaTelaCarro = new DefaultListModel();
    
    BD_carros bd = new BD_carros();
           
         

    public ControladorCarro(JTextField JTid, JTextField JTplaca, JTextField JTkm, JButton JBSalvarEditar, JList<String> JListCarro) {
        this.JTid = JTid;
        this.JTplaca = JTplaca;
        this.JTkm = JTkm;
        this.JBSalvarEditar = JBSalvarEditar;
        this.JListCarro = JListCarro;
       
        
        BDcarros = bd.carregarBanco();
        novoid();
        
        carregarlista();
    }
    
    public void novoid(){
        int tamanhoArray = BDcarros.size();
        JTid.setText((tamanhoArray+1)+"");
    }
    
    public void salvarCarro(){
        String nid = JTid.getText();
        String nPlaca = JTplaca.getText();
        String nkm = JTkm.getText();
        boolean verificador = true;
        
        if(campoVazio(nPlaca)){
            JOptionPane.showMessageDialog(null, "O campo Placa não pode ser vazio");
            verificador = false;
        }
        if(campoVazio(nkm)){
            JOptionPane.showMessageDialog(null, "O campo Km não pode ser vazio");
            verificador = false;
    }
        
        if(verificador){
            //SALVAR
            
            Carro novoCarro = new Carro(Integer.parseInt(nid), nPlaca, Integer.parseInt(nkm));
            
            
            if(JBSalvarEditar.getText().compareToIgnoreCase("Salvar")==0){
                BDcarros.add(novoCarro);
            }else{
                int index = 0;
                
                for (Carro carro1 : BDcarros) {
                    if (carro1.getId()==novoCarro.getId()){
                        break;
                    }
                    index++;
                    
                }
                
                BDcarros.set(index, novoCarro);
            }
            
            
            
            limpar();
            
            carregarlista();
            
            bd.salvarBanco(BDcarros);
            
        }



        
    }
    
    public boolean campoVazio(String temp){
        return temp.isEmpty();
    }
    
    public void limpar(){
        JTplaca.setText("");
        JTkm.setText("");
        JBSalvarEditar.setText("Salvar");
        novoid();
    }
    
    public void carregarlista(){
        listaTelaCarro = new DefaultListModel();
        
        ArrayList<String> ListaTelaAtualizar = new ArrayList<>();
        
        for (Carro carro1 : BDcarros) {
            ListaTelaAtualizar.add(carro1.getPlaca()+ " ("+carro1.getId()+")");
        }
        
        Collections.sort(ListaTelaAtualizar);
        
        listaTelaCarro.addAll(ListaTelaAtualizar);
        
        JListCarro.setModel(listaTelaCarro);
    }
    
    public void editar(){
        String temp = JListCarro.getSelectedValue();
        
        int indexInicioConsulta = temp.indexOf("(",2);
        int indexFinalConsulta = temp.indexOf(")",2);
        
        String res = temp.substring(indexInicioConsulta + 1, indexFinalConsulta);
        
        int id = Integer.parseInt(res);
        
        Carro carroEditar = buscar(id);
        
        JTid.setText(carroEditar.getId()+"");
        JTplaca.setText(carroEditar.getPlaca());
        JTkm.setText((carroEditar.getKm()+""));
        
        JBSalvarEditar.setText("Editar");
        
    }
    
    public Carro buscar(int id){
        for (Carro carro1 : BDcarros) {
            if(carro1.getId()==id){
                return carro1;
            }
            
        }
        return null;
    }
}