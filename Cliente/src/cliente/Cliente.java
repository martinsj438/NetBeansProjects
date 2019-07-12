
package cliente;


public abstract class Cliente {
    public int codcliente;
    public long telefone;
    public String email;
    public String rua;
    public int numero;
    public String complemento;
    public String bairro;
    public long cep;
    public String municipio;
    public String estado;
    public double valormensalidade;
    public double valorfinal;
    
     public Cliente (int codcliente, long telefone,String email,String rua, int numero, 
             String complemento, String bairro, long cep, String municipio, String estado, double valormensalidade, 
             double valorfinal){
        
    }

    /**
     * @return the codcliente
     */
    public int getCodcliente() {
        return codcliente;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public long getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(long cep) {
        this.cep = cep;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the valormensalidade
     */
    public double getValormensalidade() {
        return valormensalidade;
    }

    /**
     * @param valormensalidade the valormensalidade to set
     */
    public void setValormensalidade(double valormensalidade) {
        this.valormensalidade = valormensalidade;
    }

    /**
     * @return the valorfinal
     */
    public double getValorfinal() {
        return valorfinal;
    }

    /**
     * @param valorfinal the valorfinal to set
     */
    public void setValorfinal(double valorfinal) {
        this.valorfinal = valorfinal;
    }

   

    
    
    //metodos: contrutores do encapsulamento 
    //set= apontar get= resgatar
    



          public abstract void inserir();
          public abstract void mostrar();  
          public abstract double calcularvalorfinal(); 

}
