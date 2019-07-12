
package funcionario1;

public class Coordenador {
    
    
    private double salario;
    private double comissão;
            

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the comissão
     */
    public double getComissão() {
        return comissão;
    }

    /**
     * @param comissão the comissão to set
     */
    public void setComissão(double comissão) {
        this.comissão = comissão;
    }
    
    public void calcularComissao(double comissao){
        comissao=salario*0.15;
        
    }
     public void calcularInss(double inss){
    
        if(salario>=1000){
    inss=salario*0.11;
    }
        if(salario<=999){
    inss=salario*0.09;
    }
    }
    
}
