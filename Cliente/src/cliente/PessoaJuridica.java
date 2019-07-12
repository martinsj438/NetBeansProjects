
package cliente;

import javax.swing.JOptionPane;


public abstract class PessoaJuridica extends Cliente{
    
   private String cnpj;
   private String razaosocial;
   private String nomefantasia;
   private double descontopj;
   
    public PessoaJuridica(){
       super(0,0,null,null,0,null,null,0,null,null,0,0);
    }
   
    
 

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razaosocial
     */
    public String getRazaosocial() {
        return razaosocial;
    }

    /**
     * @param razaosocial the razaosocial to set
     */
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    /**
     * @return the nomefantasia
     */
    public String getNomefantasia() {
        return nomefantasia;
    }

    /**
     * @param nomefantasia the nomefantasia to set
     */
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    /**
     * @return the descontopj
     */
    public double getDescontopj() {
        return descontopj;
    }

    /**
     * @param descontopj the descontopj to set
     */
    public void setDescontopj(double descontopj) {
        this.descontopj = descontopj;
    }
    
     public void inserircliente(){
        
       
        cnpj=(JOptionPane.showInputDialog("cnpj"));
        razaosocial=(JOptionPane.showInputDialog("Razão Social"));
        nomefantasia=(JOptionPane.showInputDialog("Nome Fantasia"));
        email=(JOptionPane.showInputDialog("Email"));
        rua=(JOptionPane.showInputDialog("Rua"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
        complemento=(JOptionPane.showInputDialog("Complemento"));
        bairro=(JOptionPane.showInputDialog("Bairro"));
        cep=(Long.parseLong(JOptionPane.showInputDialog("CEP")));
        estado=(JOptionPane.showInputDialog("Estado"));
     
     }
                

    
  
}

