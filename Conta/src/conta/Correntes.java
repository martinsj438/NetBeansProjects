

package conta;

import javax.swing.JOptionPane;

public class Correntes extends Conta {

   
    private double taxamensal;
    

    
    public double getTaxamento() {
        return taxamento;
    }

    public void setTaxamento(double taxamento) {
        this.taxamento = taxamento;
    }
    private double taxamento;
    
    public Correntes(){
        super(0,null,null,null,0,0,0);
    }
    public void inserir(){
        agencia=Integer.parseInt(JOptionPane.showInputDialog("Agencia"));
          nome=JOptionPane.showInputDialog("Nome");
            cpf=JOptionPane.showInputDialog("CPF");
             datanascimento=JOptionPane.showInputDialog("Data de Nasc");
        setSaldoinicial(Double.parseDouble(JOptionPane.showInputDialog("Saldo inicial")));
    }
    
    public void depositar (double valordeposito){
        valordeposito=Double.parseDouble(JOptionPane.showInputDialog("Valor Deposito:"));
        this.valordedeposito=valordeposito;
    }
    public void calculartaxamensal(double taxamensal){
        double getSaldoinicial = 0;
        
       taxamensal=(getValordedeposito()+getSaldoinicial())*0.08;
        this.taxamensal=taxamensal;
    }
    public void calcularsaldofinal (double saldofinal){
        saldofinal=getSaldoinicial()+getValordedeposito()-getTaxamento();
        this.saldofinal=saldofinal;
    }
    public void mostrar(){
        System.out.println("Agência: "+super.getAgencia());
        System.out.println("Nome: "+super.getNome());
        System.out.println("CPF" +super.getCpf());
        System.out.println("Data de Nasc: "+super.getDatanascimento());
        System.out.println("Valor incial: "+super.getSaldofinal());
        System.out.println("Valor Deposito: "+super.getValordedeposito());
        System.out.println("Taxa Mensal: "+super.getTaxamensal());
        System.out.println("Saldo Final: "+super.getSaldofinal());
    }
    
}
