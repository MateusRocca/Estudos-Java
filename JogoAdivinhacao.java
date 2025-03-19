import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100) + 1;
        int chute;
        int tentativa = 1;
        boolean acertou = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Vamos jogar o jogo da adivinhação!
                Será sorteado um número aleatório de 1 a 100.
                Você terá 5 tentativas para acertar o número!
                Insira o seu primeiro palpite: 
                """);
        do {
            chute = scanner.nextInt();
            String resultado = (chute > numeroAleatorio) ? "Errado! Seu chute de " + chute + " está acima do número sorteado":
                    "Errado! Seu chute de " + chute + " está abaixo do número sorteado";
            if (chute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
                break;
            }

            System.out.println(resultado);
            tentativa++;
        } while (tentativa <= 5);

        if (!acertou) {
            System.out.printf("Suas tentativas acabaram! O número sorteado foi: %d", numeroAleatorio);
        }

    }
}
