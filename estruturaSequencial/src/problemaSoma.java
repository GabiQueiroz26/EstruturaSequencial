import java.util.Scanner;

public class problemaSoma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, y;
        int soma;

        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.println("Soma = " + soma);
    }
}
