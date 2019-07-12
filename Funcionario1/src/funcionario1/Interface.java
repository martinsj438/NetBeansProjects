
package Funcionario1;

import javax.swing.JOptionPane;

public class Interface extends Funcionario1 {
    
        public static void main(String[] args) {
            double salario=0;
            double inss=0;
            double comissao=0;
            double salariofinal=0;
            double salarioprof=0;
            
            Professor pf=new Professor();
            Coordenador cd=new Coordenador();
            
            System.out.println("Resultado da Aplicação");
            
            int op=Integer.parseInt(JOptionPane.showInputDialog("Opção"));
            
            int resp=JOptionPane.YES_OPTION;
            while(resp==JOptionPane.YES_OPTION){
                System.out.println("Menu");
                System.out.println("1- Professor");
                System.out.println("2- Coordenador");
                
                switch(op){
                    case 1:
                        System.out.println("Professor");
                        pf.inserirFuncionario1();
                        pf.calcularSalarioprof ();
                        pf.mostrarprof();
                        break;
                        
                    case 2: 
                         System.out.println("Coordenador");
                    cd.inserirFuncionario();
                    cd.calcularInss(inss);
                    cd.calcularComissao(comissao);
                    cd.calcularSalariofinal(salariofinal);
                    cd.mostrar();
                    break;
                    default:
                    System.out.println("Opção Inválida");
                    break;
                       
                    default:
                           
                    System.out.println("Opção inválida");
                        
               
               resp=JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
               if(resp==JOptionPane.YES_OPTION){
                   op=Integer.parseInt(JOptionPane.showInputDialog("Opção"));
               }
            }
          }
        }
     }


    

