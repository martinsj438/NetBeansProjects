
package conta;


public abstract class Conta {

    /**
     * @return the saldoinicial
     */
    public double getSaldoinicial() {
        return saldoinicial;
    }

    /**
     * @param saldoinicial the saldoinicial to set
     */
    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    
    
    protected int numconta;
    public int agencia;
    public String nome;
    public String cpf;
    public String datanascimento;
    public double valordedeposito;
    public double saldofinal;
    public double saldoinicial;
    
    public Conta(int agencia,String nome, String cpf, String datanascimento,double 
            saldoinicial,double valordeposito,double saldofinal){
        
    }
    //metodos: contrutores do encapsulamento 
    //set= apontar get= resgatar
    

public int getAgencia() {
        return agencia;
    }

    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getDatanascimento() {
        return datanascimento;
    }

   
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

   
    public double getValordedeposito() {
        return valordedeposito;
    }

    
    public void getValordedeposito(double valordedeposito) {
        this.valordedeposito = valordedeposito;
    }

    
    public double getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(double saldofinal) {
        this.saldofinal = saldofinal;
    }

    public abstract void inserir();
    public abstract void depositar(double valordeposito);
    public abstract void calcularsaldofinal(double saldofinal);
    public abstract void mostrar();        

    String getTaxamensal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    }
