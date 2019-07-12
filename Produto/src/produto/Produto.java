package produto;
import javax.swing.JOptionPane;

public class Produto {

    public static void main(String[] args) {
        double desconto=0;
        double precototal=0;
        
        System.out.println("Resultado da Aplicação");
        Produto p=new Produto();
        int c=1;
        while(c<=3){
        p.inserirproduto();
        p.calculardesconto(desconto);
        p.calculartotal(precototal);
        p.mostrarproduto();
        c++;
        }
    }
    protected int codprod;
    public String nome;
    public int qtde_estoque;
    public double precounidade;
    public double desconto;
    public int quantidade;
    public double precototal;
    
    void inserirproduto(){
        nome= JOptionPane.showInputDialog("Nome");
        qtde_estoque=Integer.parseInt
        (JOptionPane.showInputDialog("Estoque"));
        precounidade=Double.parseDouble
        (JOptionPane.showInputDialog("Unidade"));
    }
    void calculardesconto(double desconto){
        desconto=precounidade*0.05;
        this.desconto=desconto;
    }
    void calculartotal(double precototal){
        quantidade=Integer.parseInt
       (JOptionPane.showInputDialog("Quantidade"));
        precototal=(quantidade*precounidade)-desconto;
        this.precototal=precototal;
    }
    void mostrarproduto(){
        System.out.println("Nome: "+nome);
        System.out.println("Estoque: "+qtde_estoque);
        System.out.println("Unidade: "+precounidade);
        System.out.println("Desconto: "+desconto);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Total: "+precototal);
    }
}