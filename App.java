import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nota = new int[3];
        double media, soma = 0;
        String nome, disciplina;
        String repete = "S";

        while (repete.equals("S")) {
            System.out.println("Digite o nome do(a) aluno(a): ");
            nome = scanner.nextLine();
            System.out.println("Digite o nome da Disciplina: ");
            disciplina = scanner.nextLine();

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite sua nota " + (i + 1) + " de " + disciplina + " :");
                nota[i] = scanner.nextInt();
                if (nota[i] >= 0 && nota[i] <= 10) {
                    soma += nota[i];
                } else {
                    System.out.println("Esse valor é invalido");
                }

                while (nota[i] < 0 || nota[i] > 10) {
                    System.out.println("Digite sua nota nova " + (i + 1) + " :");
                    nota[i] = scanner.nextInt();
                    if (nota[i] > 0 && nota[i] <= 10) {
                        soma += nota[i];
                    }
                }
            }

            media = soma / 3;

            System.out.println("A média de " + nome + " foi de: " + media + " pontos");

            if (media >= 7 && media <= 10) {
                System.out.println("O aluno(a) " + nome + " foi aprovado em " + disciplina);
            } else if (media >= 5 && media < 7) {
                System.out.println("O aluno(a) " + nome + " está de recuperação em " + disciplina);
            } else {
                System.out.println("O aluno(a) " + nome + " está reprovado em " + disciplina);
            }

            System.out.println("Deseja repetir? (S ou N)");
            repete = scanner.next();
        }
    }
}