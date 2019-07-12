/*
Estrutura de repetição WHILE
contador = valor inicial / while contador >= ou <= limite
{ instruções contador ++ }
 */
public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Numeros Multiplos de 5");
        int cont=500;
        while (cont<=550){
            if(cont%5==0){
                System.out.println(cont);
                    
            }
            cont++;
        }
    }
}
