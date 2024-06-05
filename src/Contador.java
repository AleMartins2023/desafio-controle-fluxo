import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            // Se parametroUm é menor que parametroDois, realiza a contagem
            int contagem = parametroDois - parametroUm;

            // Itera de parametroUm até parametroDois, imprimindo cada número
            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else {
            // Se parametroUm é maior ou igual a parametroDois, lança a exceção
            throw new ParametrosInvalidosException();
        }
    }
}

// Classe para representar a exceção personalizada
class ParametrosInvalidosException extends Exception {
    // Você pode adicionar um construtor ou outros métodos aqui se necessário
}
