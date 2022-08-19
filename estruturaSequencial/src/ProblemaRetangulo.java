import java.util.Scanner;

public class ProblemaRetangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double b, h;
        double area, quadradoB, quadradoH, somaQuadrados, perimetro, diagonal;
    
        System.out.println("Digite a medida da base do retângulo: ");
        b = sc.nextDouble();
        System.out.println("Digite a medida da altura do retângulo: ");
        h = sc.nextDouble();
    

        area = b * h;
        perimetro = 2 * (b + h);
        quadradoB = Math.pow(b, 2);
        quadradoH = Math.pow(h, 2);
        somaQuadrados = quadradoB + quadradoH;
        diagonal = Math.sqrt(somaQuadrados);

        System.out.printf("%n área do retângulo = %.4f %n", area);
        System.out.printf("perimetro do retângulo = %.4f %n", perimetro);
        System.out.printf("diagonal do retângulo = %.4f %n", diagonal);

        sc.close();
    }
}
