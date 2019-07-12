package modelo;

public class ClienteJuridico extends Cliente {
    private String cnpj;
    
    public void validarCnpj(String cnpj){
        System.out.println("CNPJ Válido");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
