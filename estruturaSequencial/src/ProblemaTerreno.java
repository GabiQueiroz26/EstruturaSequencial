import java.util.Scanner;

public class ProblemaTerreno {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double l,c;
        double metro;
        double area, preco;
    
        System.out.println("Digite a largura do terreno: ");
        l = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        c = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado do terreno: ");
        metro = sc.nextDouble();

        area = l * c;
        preco = metro * area;

        System.out.printf("%n área do terreno = %.2f %n", area);
        System.out.printf("preço do terreno = %.2f %n", preco);

        sc.close();
    }
}

