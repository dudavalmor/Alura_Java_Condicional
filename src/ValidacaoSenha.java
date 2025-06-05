import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        String senhaCorreta = "123456";
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = leia.nextLine();

        leia.close();

        if (senha.equals(senhaCorreta)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
