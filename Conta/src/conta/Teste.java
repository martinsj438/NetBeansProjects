
package conta;

import javax.swing.JOptionPane;

public class Teste {
    
        public static void main(String[] args) {
            double valordedeposito=0;
            double taxamensal=0;
            double saldofinal=0;
            double rendimento=0;
            
            Correntes cc=new Correntes();
            Poupanca cp=new Poupanca();
            
            System.out.println("Resultado da Aplicação");
            
            int op=Integer.parseInt(JOptionPane.showInputDialog("Opção"));
            
            int resp=JOptionPane.YES_OPTION;
            while(resp==JOptionPane.YES_OPTION){
                System.out.println("Menu");
                System.out.println("1- Conta Corrente");
                System.out.println("2- Conta Poupança");
                
                switch(op){
                    case 1:
                        System.out.println("Conta corrente");
                        cc.inserir();
                        cc.depositar(valordedeposito);
                        cc.calculartaxamensal(taxamensal);
                        cc.calcularsaldofinal(saldofinal);
                        cc.mostrar();
                        break;
                        
                    case 2: 
                        System.out.println("Conta Poupança");
                        cp.inserir();
                        cp.depositar(valordedeposito);
                        cp.calcularrendimento(rendimento);
                        cp.calcularsaldofinal(saldofinal);
                        cp.mostrar();
                        break;
                    default:
                        System.out.println("Opção inválida");
                        
                }
               resp=JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
               if(resp==JOptionPane.YES_OPTION){
                   op=Integer.parseInt(JOptionPane.showInputDialog("Opção"));
               }
            }
        }
    }
    

