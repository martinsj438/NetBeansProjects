package modelo;

public class Cliente {
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String nomeSocial;
    private String email;
    private String senha;
    
    
    public Cliente(){  
    }

    public Cliente(int idCliente, String nome, String sobrenome, String nomeSocial, String email, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeSocial = nomeSocial;
        this.email = email;
        this.senha = senha;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
 public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}