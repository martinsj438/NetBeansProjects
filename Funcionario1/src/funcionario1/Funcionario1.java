
package funcionario1;

public abstract class Funcionario1  {
    
    

 public static void main(String[] args) {
        
 }
    public int matricula;
    public String cpf;
    public long rg;
    public String nome;
    public double inss;
    public double salariofinal;
        

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public long getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(long rg) {
        this.rg = rg;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the inss
     */
    public double getInss() {
        return inss;
    }

    /**
     * @param inss the inss to set
     */
    public void setInss(double inss) {
        this.inss = inss;
    }

    /**
     * @return the salariofinal
     */
    public double getSalariofinal() {
        return salariofinal;
    }

    /**
     * @param salariofinal the salariofinal to set
     */
    public void setSalariofinal(double salariofinal) {
        this.salariofinal = salariofinal;
    }



   public abstract void inserirFuncionario1();
   public abstract void calcularInss(double Inss);
   public abstract void calcularSalariofinal(double Salariofinal);
   public abstract void calcularSalario_prof(double Salarioprof);
   public abstract void mostrarFuncionario(); 

   
   
   
  } 



