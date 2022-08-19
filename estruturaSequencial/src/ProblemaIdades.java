import java.util.Scanner;

public class ProblemaIdades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;
        double idadeMedia;
    
        System.out.println("Digite o nome da primeira pessoa: ");
        nome1 = sc.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();
        System.out.println("Digite o nome da segunda pessoa: ");
        nome2 = sc.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();
       
        idadeMedia = (idade1 + idade2) /2;

        System.out.printf(" A idade média de " + nome1 + " e " + nome2 + " é de " + idadeMedia);

        sc.close();
    }
}
