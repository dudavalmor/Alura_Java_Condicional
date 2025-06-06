import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int primeiroLado = leia.nextInt();
        System.out.println("Digite o segundo lado: ");
        int segundoLado = leia.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int terceiroLado = leia.nextInt();

        leia.close();

        if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado &&
                segundoLado + terceiroLado > primeiroLado){
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
