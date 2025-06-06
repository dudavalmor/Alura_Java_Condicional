import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo: ");
        double valor = leia.nextDouble();

        if ((valor >= 1000) && (valor <= 5000)) {
            System.out.println("O valor de " + valor + " está dentro do" +
                    "intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor de " + valor + " não está dentro do" +
                    "intervalo permitido para empréstimo.");
        }
    }
}
