/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import modelo.Cliente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author victorperes
 */
public class BD_Cliente {
    
     public int salvarBanco(ArrayList<Cliente> dados) {
        try {
            FileOutputStream fs = new FileOutputStream("ClienteBanco.vcp");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(dados);
            os.close();
            return 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return -1;
        }
    }
      
    public ArrayList<Cliente> carregarBanco() {       
        ArrayList<Cliente> dados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("ClienteBanco.vcp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();

            dados = (ArrayList<Cliente>) ob;
            ois.close();
            return dados;

        } catch (Exception ex) {
            ex.printStackTrace();
            return dados;
        }
    }  
}
