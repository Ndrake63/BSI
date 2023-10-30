/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import Visao.Cadastrar_produto;
import Visao.Login;
import Visao.Tela_administrador;
import Visao.Tela_caixa;
import Visao.Tela_venda;
import Visao.Usuario;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author alunos
 */
public class Controlador_telas {
    JDesktopPane desktopPane;
    
    public Controlador_telas(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }
    
    public void Login(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Login tela = new Login(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
    }
    
    public void Cadastrar_produto(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Cadastrar_produto tela = new Cadastrar_produto(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
}
    public void Tela_administrador(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Tela_administrador tela = new Tela_administrador(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
}
    public void Usuario(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Usuario tela = new Usuario(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
}
    public void Tela_caixa(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Tela_caixa tela = new Tela_caixa(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
    }
    
    public void Tela_venda(Controlador_telas controlador_telas) {
        desktopPane.removeAll();
        desktopPane.updateUI();
        Dimension resolucao = desktopPane.getSize();
        Tela_venda tela = new Tela_venda(controlador_telas);
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
    }
}
