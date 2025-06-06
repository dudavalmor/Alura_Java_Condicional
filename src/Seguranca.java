import java.util.Scanner;

public class Seguranca {
    public static void main(String[] args) {

        int codigoCorreto = 2023;
        int permissaoMin = 1;
        int permissaoMax = 3;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o código de acesso numérico: ");
        int codigo = leia.nextInt();
        System.out.println("Digite um nível de permissão numérico: ");
        int permissao = leia.nextInt();

        leia.close();

        boolean codigoValido = (codigoCorreto == codigo);
        boolean permissaoValida = (permissao >= permissaoMin && permissao <= permissaoMax);

        if (codigoValido && permissaoValida){
            System.out.println("Acesso permitido. Seja bem-vindo ao sistema.");
        } else {
            System.out.println("Acesso negado. Motivo: ");
        } if (!codigoValido) {
            System.out.println("- Código inválido.");
        } if (!permissaoValida) {
            System.out.println("- Nível de permissão inválida.");
        }

    }
}
