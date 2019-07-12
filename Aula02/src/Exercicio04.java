
import static javafx.scene.input.KeyCode.X;
import javax.swing.JOptionPane;

/*
Produzir na tela uma tabuada de multiplicar em que o usuario
ira escolher um numero e vai gerar na tela o resultado: 
ex: 2 x 0 = 0 ate o contador 10
   numero escolhido X contador = resultado
 */
public class Exercicio04{
    public static void main(String[] args) {
        int x=Integer.parseInt
        (JOptionPane.showInputDialog("Número:"));
        for(int c=0;c<=10;c++){
            int r=x*c;/*voce pode anular esta linha e mostrar o resultado no sout*/
            System.out.println(x+" X "+c+" = "+r);
            // NO SOUT = System.out.println(X+" X "+c+" = "+X*c); //
        }
    }
} 
    