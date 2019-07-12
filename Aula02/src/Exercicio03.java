
import javax.swing.JOptionPane;

/*
Exercicio 03: Com estrutura FOR, criar uma aplicação em que o usuario insira
10 numeros inteirosa e verifique se são pares ou impares;
 */
public class Exercicio03 {
     public static void main(String[] args) {
        System.out.println("Teste o Numero");
        for(int c=1;c<=10;c++){
            int x=Integer.parseInt
        (JOptionPane.showInputDialog("Insira o numero"));
            if(x%2==0){
                 System.out.println(x + " é par."); 
                 
                 
            }
            else{
                System.out.println(x + " é impar.");
            } 
        }
    
    }
}


