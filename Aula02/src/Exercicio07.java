
import javax.swing.JOptionPane;

/*
Exercicio 07: Com estrutura WHILE, faça uma aplicação em que leia e escreva 5
nomes, suas notas 1 e 2, suas medias calculadas e suas situações onde:
média >= 9 "O"
média <9 e >=7 "B"
média <7 e >=6 "S"
média <6 "I"
 */
public class Exercicio07 {
    public static void main(String[] args) {
       int c=1;
        while(c<=5){
        String nome=JOptionPane.showInputDialog("Nome");
        double n1=Double.parseDouble  (JOptionPane.showInputDialog("Nota 1"));
        double n2=Double.parseDouble (JOptionPane.showInputDialog("Nota 2"));
        
        double media=(n1+n2)/2;    
        String conceitos="";
        
        
        
            if(media>=9){
                conceitos="O";
            }
            if(media<9 && media>=7){
                conceitos="B";
            }
            if(media<7 && media>=6){
                conceitos="S";
            }
            if(media>=6){
                conceitos="I";
            }
           
            System.out.println(c+"º Aluno");
            System.out.println("Nome: "+nome);
            System.out.println("Nota 01:"+n1);
            System.out.println("Nota 02:"+n2);
            System.out.println("Média:"+media);
            System.out.println("Conceitos:"+conceitos);
            System.out.println("");
            c++;
                    
           
        
        
        
        
        
        
        
    }
    
    }
}
