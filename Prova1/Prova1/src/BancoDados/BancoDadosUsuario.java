/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import Modelo.Cadastro_usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author MOISES
 */
public class BancoDadosUsuario {
    public int salvarBanco(ArrayList<Cadastro_usuario> dados) {
        try {
            FileOutputStream fileStream = new FileOutputStream("BancoUsuario.moisa");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);
            outputStream.writeObject(dados);
            outputStream.close();
            return 0;
        } catch(Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }
    
    public ArrayList<Cadastro_usuario> carregarBanco() {
        ArrayList<Cadastro_usuario> dados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("BancoUsuario.moisa");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object objeto =ois.readObject();
            
            dados = (ArrayList<Cadastro_usuario>) objeto;
            ois.close();
            return dados;
        } catch(Exception ex) {
            ex.printStackTrace();
            return dados;
        }
    }
    
}


