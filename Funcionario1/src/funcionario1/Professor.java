
package funcionario1;

import javax.swing.JOptionPane;

public abstract class Professor extends Funcionario1 {
    
    
    double hora_aula;
    int quantidade_tempo;
    private double salario_prof;

    /**
     * @return the hora_aula
     */
    public double gethora_aula() {
        return hora_aula;
    }

    /**
     * @param hora_aula the hora_aula to set
     */
    public void setHora_aula(double hora_aula) {
        this.hora_aula = hora_aula;
    }

    /**
     * @return the quantidade_tempo
     */
    public int getQuantidade_tempo() {
        return quantidade_tempo;
    }

    /**
     * @param quantidade_tempo the quantidade_tempo to set
     */
    public void setQuantidade_tempo(int quantidade_tempo) {
        this.quantidade_tempo = quantidade_tempo;
    }

    /**
     * @return the salario_prof
     */
    public double getsalario_prof() {
        return salario_prof;
    }

    /**
     * @param salario_prof the salario_prof to set
     */
    public void setSalario_prof(double salario_prof) {
        this.salario_prof = salario_prof;
       }          
        
    
   
    public void inserirFuncionario1(){
         
         cpf=JOptionPane.showInputDialog("CPF:");
         rg=Long.parseLong(JOptionPane.showInputDialog("RG:"));
         nome=JOptionPane.showInputDialog("Nome:");
         hora_aula=Double.parseDouble(JOptionPane.showInputDialog("Hora de aula:"));
         quantidade_tempo=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de tempo:"));
        
    }
    
      

     public void calcularSalarioprof (double salarioprof){
        
        salario_prof = quantidade_tempo* hora_aula;
        this.salario_prof=salario_prof;
    
}
     
     public void calcularInss(double inss){
    
        if(salario_prof>=1000){
    inss=salario_prof*0.11;
    }
        if(salario_prof<=999){
    inss=salario_prof*0.09;
    }
    }
     
     public void mostrarprof(){
         
        System.out.println("Nome: "+super.getNome());
        System.out.println("CPF" +super.getCpf());
        System.out.println("RG: "+super.getRg());
        System.out.println("RG: "+super.getRg());
        System.out.println("Salario Final: "+super.getSalariofinal());
    }
}
