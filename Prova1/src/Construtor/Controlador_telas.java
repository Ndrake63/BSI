/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Construtor;

import Visao.Cadastrar_produto;
import Visao.Login;
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
        Cadastrar_produto tela = new Cadastrar_produto();
        tela.setSize(resolucao);
        tela.setLocation(0, 0);
        desktopPane.add(tela);
        tela.setVisible(true);
}
}
