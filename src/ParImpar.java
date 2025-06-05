import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("---------------- PAR OU ÍMPAR ----------------");
        System.out.println("Digite um número inteiro: ");
        int numero = leia.nextInt();

        if ((numero % 2) == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
