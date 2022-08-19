import java.util.Scanner;

public class problemaDuracao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int duracaoSeg, horas, minutos, segundos, resto;

        System.out.println("Digite a duração em segundos: ");
        duracaoSeg = sc.nextInt();

        horas = duracaoSeg / 3600;
        resto = duracaoSeg % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
         
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
