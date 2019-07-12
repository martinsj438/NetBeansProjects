/*
 
 */
package funcionarios;

import javax.swing.JOptionPane;

/*
 
 */
public class Funcionarios {

    public static void main(String[] args) {
        double inss=0;
        double salariofinal=0;
        
        Funcionarios funcionarios=new Funcionarios();
        funcionarios.inserirfuncionarios();
        funcionarios.calcularinss(inss);
        funcionarios.calcularsalariofinal(salariofinal);
        funcionarios.mostrarfuncionarios();
    }
    protected int codfuncionario;
    public String nome;
    public String cpf;
    public long identidade;
    public long telefone;
    public double salariobruto;
    public double inss;
    public double salariofinal;
    
    public void inserirfuncionarios(){
        nome=JOptionPane.showInputDialog("Nome:");
        cpf=JOptionPane.showInputDialog("CPF:");
        identidade=Long.parseLong(JOptionPane.showInputDialog("Identidade"));
        telefone=Long.parseLong(JOptionPane.showInputDialog("Telefone:"));
    }
    
    void calcularinss(double inss){
        salariobruto=Double.parseDouble(JOptionPane.showInputDialog("Salário bruto:"));
        
        if(salariobruto>=2500){
            inss=salariobruto*0.11;
        }
        if(salariobruto<2500 && salariobruto>=1500){
            inss=salariobruto*0.09;
        }
        if(salariobruto<1500){
            inss=salariobruto*0.08;
        }
        this.inss=inss;//ancapsulamento
    }
    void calcularsalariofinal(double salariofinal){
        salariofinal=salariobruto-inss;
        this.salariofinal=salariofinal;
        
    }
    void mostrarfuncionarios(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Identidade: "+identidade);
        System.out.println("Telefone: "+telefone);
        System.out.println("Salario Bruto: "+salariobruto);
        System.out.println("INSS: "+inss);
        System.out.println("Salario Final: "+salariofinal);
        
    }
}
