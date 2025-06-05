import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = leia.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.println("Os dois números tem o mesmo valor");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        } else {
            System.out.println("O maior número é: " + segundoNumero);
        }
    }
}
