import java.util.Scanner;

public class problemaMedidas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.println("Digite a medida A, B e C");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaQuadrado = Math.pow(a, 2);
        areaTriangulo = (a * b) / 2;
        areaTrapezio =  ((a + b) * c) /2;

        System.out.printf("Área do quadrado = %.4f %n",areaQuadrado);
        System.out.printf("Área do triângulo = %.4f %n",areaTriangulo);
        System.out.printf("Área do trapézio = %.4f",areaTrapezio);
    }
}
