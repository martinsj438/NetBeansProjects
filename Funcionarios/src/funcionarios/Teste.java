/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author 169121742018.3
 */
public class Teste {
    public static void main(String[] args) {
        double inss=0;
        double salariofinal=0;
        
        System.out.println("Resultado da Aplicação");
        System.out.println("");
        
        for(int c=1;c<3;c++){
            System.out.println("Funcionarios: "+c);
    
        Funcionarios funcionarios=new Funcionarios();
        funcionarios.inserirfuncionarios();
        funcionarios.calcularinss(inss);
        funcionarios.calcularsalariofinal(salariofinal);
        funcionarios.mostrarfuncionarios();
             System.out.println("");
    }
    
   }
}