import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a sua média: ");
        double media = leia.nextDouble();

        if (media >= 7.0){
            System.out.println("O estudante teve média " + media + " e foi" +
                    "aprovado.");
        } else if (media >= 5.0){
            System.out.println("O estudante teve média " + media + " e está " +
                    "de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi " +
                    "reprovado.");
        }
    }
}
