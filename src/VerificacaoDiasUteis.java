import java.util.Scanner;

public class VerificacaoDiasUteis {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o dia da semana(em letras minusculas): ");
        String dia = leia.nextLine();
        leia.close();

        if (dia.equals("segunda") || dia.equals("terça") ||
                dia.equals("quarta") || dia.equals("quinta") ||
                dia.equals("sxta")) {
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " não é um dia útil.");
        }
    }
}
