import java.util.Scanner;

public class VerificacaoDesconto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = leia.nextDouble();

        if (valorCompra >= 100){
            double novoValor = valorCompra - (valorCompra * 0.10);
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: " + novoValor);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: " + valorCompra);
        }
    }
}
