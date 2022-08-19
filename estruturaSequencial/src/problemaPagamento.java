import java.util.Scanner;

public class problemaPagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valorHora, pagamento;
        int qtdHoras;

        
        System.out.println("Digite o nome do(a) funcionário(a): ");
        nome = sc.next();
        System.out.println("Digite o valor que ele recebe por hora: ");
        valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas por ele: ");
        qtdHoras = sc.nextInt();

        pagamento = valorHora * qtdHoras;

        System.out.printf("O pagamento para " + nome + " deve ser %.2f", pagamento);
    }
}
