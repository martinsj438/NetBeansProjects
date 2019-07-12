/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import javax.swing.JOptionPane;

/**
 *
 * @author 169121742018.3
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double md=0;
       String situacao="";
       
       Aluno obj=new Aluno();//Cria-se o objeto e realiza a sua instância 
        System.out.println("Resultado da Aplicação");
        obj.inseriraluno();
        obj.calcularmedia(md);
        obj.verificarsituacao(situacao);
        obj.mostraraluno();
    }
    //1º Criamos a visibilidade (protected, public e private)
    //2º Determinamos os tipos de variaveis
    //3° Criamos as variaveis
    protected int matricula;
    public String nome;
    public String cpf;
    public long identidade;
    public long telefone;
    public double p1;
    public double p2;
    public double md;
    public String situacao;
    
    public void inseriraluno(){
        nome=JOptionPane.showInputDialog("Nome");
         cpf=JOptionPane.showInputDialog("CPF");
         identidade=Long.parseLong(JOptionPane.showInputDialog("Identidade"));
         telefone=Long.parseLong(JOptionPane.showInputDialog("Telefone"));
    }
    public void calcularmedia(double media){
        p1=Double.parseDouble(JOptionPane.showInputDialog("Prova 01"));
         p2=Double.parseDouble(JOptionPane.showInputDialog("Prova 02"));
         
         md=(p1+p2)/2;
         this.md=md;
    }
    public void verificarsituacao(String situacao){
        if(md>=7){
            situacao="AP";
        }else{
            situacao="RP";
        }
        this.situacao=situacao;
        
    }
    public void mostraraluno(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Identidade: "+identidade);
        System.out.println("Telefone: "+telefone);
        System.out.println("Prova 01: "+p1);
        System.out.println("Prova 02: "+p2);
        System.out.println("Média: "+md);
        System.out.println("Situação: "+situacao);
        
    }
}
