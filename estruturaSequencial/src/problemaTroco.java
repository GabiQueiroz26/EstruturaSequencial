import java.util.Scanner;

public class problemaTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, troco, valorCompra;
        int qtd;

        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();
        System.out.println("Digite a quantidade comprada do produto: ");
        qtd = sc.nextInt();  
        System.out.println("Digite o quanto de dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        valorCompra = preco * qtd;
        troco = dinheiro - valorCompra;
        
        System.out.printf("Troco a ser dado = %.2f ", troco);

    }
}
