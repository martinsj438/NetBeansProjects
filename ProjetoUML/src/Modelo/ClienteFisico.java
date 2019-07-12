package modelo;

public class ClienteFisico extends Cliente {
    
     private String cpf;
     
     public void validarCpf(String cpf){
        System.out.println("CPF Válido");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     
}