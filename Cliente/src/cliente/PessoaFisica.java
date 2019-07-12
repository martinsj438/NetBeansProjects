/*
 
 */
package cliente;

import javax.swing.JOptionPane;

/*
 */

public class PessoaFisica extends Cliente { 
    

   private String nome;
   private String CPF;
   private int identidade;
   private long celular;
   private double desconto;
 
    

    public PessoaFisica(){
        super(0,0,null,null,0,null,null,0,null,null,0,0);
    }
   
    
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
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the identidade
     */
    public int getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the celular
     */
   
    public long setCelular() {
        return celular;
    }


    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
      
   
    
  
    
   
       
       public void inserircliente(){
        
        nome=(JOptionPane.showInputDialog("Nome"));
        CPF=(JOptionPane.showInputDialog("CPF"));
        identidade=(Integer.parseInt(JOptionPane.showInputDialog("identidade")));
        celular=(Long.parseLong(JOptionPane.showInputDialog("Celular")));
        telefone=(Long.parseLong(JOptionPane.showInputDialog("Telefone")));
        email=(JOptionPane.showInputDialog("Email"));
        rua=(JOptionPane.showInputDialog("Rua"));
        numero=(Integer.parseInt(JOptionPane.showInputDialog("Número")));
        complemento=(JOptionPane.showInputDialog("Complemento"));
        bairro=(JOptionPane.showInputDialog("Bairro"));
        cep=(Long.parseLong(JOptionPane.showInputDialog("CEP")));
        estado=(JOptionPane.showInputDialog("Estado"));
        

}
    

    void calculardesconto(double desconto){
        desconto= getValormensalidade()*0.08;
        this.setDesconto(desconto);
}
    
    public void calcularvalorfinal(double valorfinal){
        valorfinal=getValormensalidade()+getDesconto();
        this.valorfinal=valorfinal;
    }
        public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+CPF);
        System.out.println("Identidade: "+identidade);
        System.out.println("Celular: "+celular);
        System.out.println("Telefone: "+telefone);
        System.out.println("Email: "+email);
        System.out.println("Rua: "+rua);
        System.out.println("Número: "+numero);
        System.out.println("Complemento: "+complemento);
        System.out.println("Bairro: "+bairro);
        System.out.println("CEP: "+cep);
        System.out.println("Estado: "+estado);
        System.out.println("Valor Mensalidade: "+valormensalidade);
       
    
        }   

    @Override
    public void inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularvalorfinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

  