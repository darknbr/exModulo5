import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR O IMC");

        System.out.println("Digite o seu peso: ");
        Double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        Double altura = scanner.nextDouble();

        Double resultadoImc = peso / (altura * altura);

        String categoria = obterCategoriaImc(resultadoImc);
        System.out.println("Seu IMC é: " + resultadoImc + ", " + categoria);

        scanner.close();
    }

    public static String obterCategoriaImc(Double resultadoImc) {
        if (resultadoImc <= 16.9) {
            return "muito abaixo do peso";
        } else if (resultadoImc <= 18.4) {
            return "abaixo do peso";
        } else if (resultadoImc <= 24.9) {
            return "peso normal";
        } else if (resultadoImc <= 29.9) {
            return "acima do peso";
        } else if (resultadoImc <= 34.9) {
            return "obesidade grau I";
        } else if (resultadoImc <= 40) {
            return "obesidade grau II";
        } else {
            return "obesidade grau III";
        }
    }
}
