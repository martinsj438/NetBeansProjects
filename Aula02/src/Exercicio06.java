
import javax.swing.JOptionPane;

/*
 Exercicio 06: com WHILE, faça a seguinte aplicação:

 1º o usuário irá digitar nome, cpf, idade e salario bruto

 2º a aplicação irá calcular o valor do desconto do INSS:
    salario bruto > = 2500  = calcular 11% do salario
    salario bruto <   2500 e >= 1000 = calcular 9% do Salario
    salario bruto <   1000  = calcular 8% do salario

 3º a aplicação irá calcular o valor do vale transporte:
    salario bruto > =  1500 = calcular 6% do salario
    salario bruto <   1500  = calcular 5% do salario

4°  a aplicação mostrara o cargo do funcionario conforme os parâmetros 
    baseados no desconto do INSS:
    salario bruto > = 2500  = "Acionista"
    salario bruto <   2500 >= 1000 = "Gerente"
    salario bruto <   1000  = Vendedor

5°  aplicação calculará o salário final:
    salario final = bruto-(inss+vale)

6º  a aplicação mostrará todas as informações digitos e calculadas:

7º  testar a aplicação 3 vezes: mostrando o contador no resultado.
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int c=1;
        while(c<=3){
        String nome=JOptionPane.showInputDialog("Nome");
          String cpf=JOptionPane.showInputDialog("CPF");
            int idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
            double bruto=Double.parseDouble(JOptionPane.showInputDialog("Salario Bruto"));
            
            
            double inss=0;
            
            if(bruto>=2500){
                inss=bruto*0.11;
            }
            if(bruto<2500 && bruto>=1000){
                inss=bruto*0.09;
            }
            if(bruto<100){
                inss=bruto*0.08;
            }
            double vale=0;
            if(bruto>=1500){
                vale=bruto*0.06;
            }else{
                vale=bruto*0.05;
            }
            String cargo="";
            if(bruto>=2500){
               cargo="Acionista";
            }
            if(bruto<2500 && bruto>=1000){
                cargo="Gerente";
            }
            if(bruto<100){
                 cargo="Vendedor";
            }
            double salfinal=bruto-(inss+vale);
            
            System.out.println("Funcionario:" +c);
            System.out.println("Nome: "+nome);
            System.out.println("CPF: "+cpf);
            System.out.println("Idade: "+idade);
            System.out.println("Salario Bruto: "+bruto);
            System.out.println("INSS: "+inss);
            System.out.println("Vale: "+vale);
            System.out.println("Cargo: "+cargo);
            System.out.println("Salario Final: "+salfinal);
            System.out.println("");
            c++;
        }
    }
}

   


