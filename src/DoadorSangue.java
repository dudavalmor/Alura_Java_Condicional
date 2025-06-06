import java.util.Scanner;

public class DoadorSangue {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = leia.nextInt();
        System.out.println("Digite o peso do doador: ");
        double peso = leia.nextDouble();

        leia.close();

        if (peso > 50 && idade >= 18 && idade <= 65 ){
            System.out.println("O dador é compatível com a doação.");
        } else {
            System.out.println("O doador não é compatível. Motivo: ");
            if (peso <= 50){
                System.out.println("- Deve pesar mais de 50kg.");
            } if (idade < 18){
                System.out.println("-Deve ser maior que 18 anos.");
            } if (idade > 65){
                System.out.println("O doador deve ter entre 18 e 65 anos.");
            }
        }
    }
}
