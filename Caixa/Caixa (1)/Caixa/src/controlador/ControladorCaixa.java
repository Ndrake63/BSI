/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BD.BD_Cliente;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JTextField;
import modelo.Cliente;

/**
 *
 * @author victorperes
 */
public class ControladorCaixa {

    JTextField JTStatus1;
    JTextField JTStatus2;
    JTextField JTStatus3;
    JTextField JTStatus4;

    JTextField JTNome1;
    JTextField JTNome2;
    JTextField JTNome3;
    JTextField JTNome4;

    JTextField JTValorMesa1;
    JTextField JTValorMesa2;
    JTextField JTValorMesa3;
    JTextField JTValorMesa4;

    JList<String> JLConsumo1;
    JList<String> JLConsumo2;
    JList<String> JLConsumo3;
    JList<String> JLConsumo4;

    ArrayList<Cliente> BDClientes = new ArrayList<>();

    BD_Cliente bd_cliente = new BD_Cliente();    
    
    public ControladorCaixa(JTextField JTStatus1, JTextField JTStatus2, JTextField JTStatus3, JTextField JTStatus4, JTextField JTNome1, JTextField JTNome2, JTextField JTNome3, JTextField JTNome4, JTextField JTValorMesa1, JTextField JTValorMesa2, JTextField JTValorMesa3, JTextField JTValorMesa4, JList<String> JLConsumo1, JList<String> JLConsumo2, JList<String> JLConsumo3, JList<String> JLConsumo4) {
        this.JTStatus1 = JTStatus1;
        this.JTStatus2 = JTStatus2;
        this.JTStatus3 = JTStatus3;
        this.JTStatus4 = JTStatus4;
        this.JTNome1 = JTNome1;
        this.JTNome2 = JTNome2;
        this.JTNome3 = JTNome3;
        this.JTNome4 = JTNome4;
        this.JTValorMesa1 = JTValorMesa1;
        this.JTValorMesa2 = JTValorMesa2;
        this.JTValorMesa3 = JTValorMesa3;
        this.JTValorMesa4 = JTValorMesa4;
        this.JLConsumo1 = JLConsumo1;
        this.JLConsumo2 = JLConsumo2;
        this.JLConsumo3 = JLConsumo3;
        this.JLConsumo4 = JLConsumo4;
    }
    
    

    public void atualizando() {
        
        BDClientes = bd_cliente.carregarBanco();

        for (Cliente cli : BDClientes) {
            if (cli.getStatus() == 0) {
                
                if (cli.getMesa() == 1) {
                    JTNome1.setText(cli.getNome());
                    JTStatus1.setText("Pedido realizado");
                }
                if (cli.getMesa() == 2) {
                    JTNome2.setText(cli.getNome());
                    JTStatus2.setText("Pedido realizado");
                }
                if (cli.getMesa() == 3) {
                    JTNome3.setText(cli.getNome());
                    JTStatus3.setText("Pedido realizado");
                }
                if (cli.getMesa() == 4) {
                    JTNome4.setText(cli.getNome());
                    JTStatus4.setText("Pedido realizado");
                }
            }
            
            
             if (cli.getStatus() == 1) {
                
                if (cli.getMesa() == 1) {
                    JTNome1.setText(cli.getNome());
                    JTStatus1.setText("Aguardando Pedido");
                }
                if (cli.getMesa() == 2) {
                    JTNome2.setText(cli.getNome());
                    JTStatus2.setText("Aguardando Pedido");
                }
                if (cli.getMesa() == 3) {
                    JTNome3.setText(cli.getNome());
                    JTStatus3.setText("Aguardando Pedido");
                }
                if (cli.getMesa() == 4) {
                    JTNome4.setText(cli.getNome());
                    JTStatus4.setText("Aguardando Pedido");
                }
            }
        }

    }

}
