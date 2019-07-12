
package conta;

import javax.swing.JOptionPane;


public class Poupanca extends Conta {
    private double rendimento;
    
    public Poupanca(){
        super(0,null,null,null,0,0,0);
    }
    
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
   public void inserir(){
        agencia=Integer.parseInt
        (JOptionPane.showInputDialog("Agência"));
        nome=JOptionPane.showInputDialog("Nome");
        cpf=JOptionPane.showInputDialog("CPF");
        datanascimento=JOptionPane.showInputDialog("Data de Nasc");
        saldoinicial=Double.parseDouble
        (JOptionPane.showInputDialog("Saldo Inicial"));
    } 
   public void depositar(double valordeposito){
        valordeposito=Double.parseDouble
        (JOptionPane.showInputDialog("Valor Depósito:"));
        this.valordedeposito=valordeposito;
    }
   public void calcularrendimento(double rendimento){
       rendimento=(getValordedeposito()+getSaldoinicial())*0.11;
       this.rendimento=rendimento;
   }
   public void calcularsaldofinal(double saldofinal){
        saldofinal=getSaldoinicial()+getValordedeposito()+getRendimento();
        this.saldofinal=saldofinal;
    }
    public void mostrar(){
        System.out.println("Agência: "+super.getAgencia());
        System.out.println("Nome: "+super.getNome());
        System.out.println("CPF: "+super.getCpf());
        System.out.println("Data de Nasc: "+super.getDatanascimento());
        System.out.println("Valor Inicial: "+super.getSaldoinicial());
        System.out.println("Valor Depósito: "+super.getValordedeposito());
        System.out.println("Rendimento: "+getRendimento());
        System.out.println("Saldo Final: "+super.getSaldofinal());
    }
}