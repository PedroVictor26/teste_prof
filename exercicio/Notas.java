import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();

        double[] notas = new double[2];
        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = teclado.nextDouble();
                if (notas[i] >= 0 && notas[i] <= 10) {
                    break;
                } else {
                    System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                }
            }
        }
        teclado.close();

        double media = (notas[0] + notas[1]) / 2;
        String resultado;

        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Segunda nota: " + notas[1]);
        System.out.println("Resultado: " + resultado);
    }
}