package Teste;

import modelo.ClienteFisico;

public class TesteCliente {
    public static void main(String[] args) {
        //Cliente Físico
    ClienteFisico clienteFisico = new ClienteFisico();
    clienteFisico.setIdCliente(1);
    clienteFisico.setNome("Karoline");
    clienteFisico.setCpf("169.936.257-26");
    
    clienteFisico.validarCpf(clienteFisico.getCpf());
    }
}
