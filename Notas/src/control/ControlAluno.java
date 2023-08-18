/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Alunos;

/**
 *
 * @author alunos
 */
public class ControlAluno {
    JTextField nome;
    JTextField idade;
    JTextField nota1;
    JTextField nota2;
    JTextField nota3;
    JTextArea saida;

    public ControlAluno(JTextField nome, JTextField idade, JTextField nota1, JTextField nota2, JTextField nota3, JTextArea saida) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.saida = saida;
    }
    
    public void media(){
        String nome2 = nome.getText();
        int idade2 = Integer.parseInt(idade.getText());
        float nota11 = Integer.parseInt(nota1.getText());
        float nota22 = Integer.parseInt(nota2.getText());
        float nota33 = Integer.parseInt(nota3.getText());
        
        Alunos a1 = new Alunos(nome2, idade2, nota11, nota22, nota33);
        
        float res = calcular(a1);
       
        
        if(res>=6){
            //Aprovado
             saida.setText("O"+a1.getNome()+" = Aprovado com média "+res);  
        }else{
             saida.setText("O "+a1.getNome()+" = Reprovado com média "+res);

        }
    }
    
    public float calcular(Alunos x){
        float med = (x.getNota1()+x.getNota2()+x.getNota3())/3;
        return med;
    }
}
