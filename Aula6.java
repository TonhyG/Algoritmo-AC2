import java.util.Scanner;

public class Aula6{

    public static void main(String[] args) {

        // Informa o usuário o proposito do programa
        System.out.println(
                "Este programa ira fazer a somas das suas notas e mostrar qual será sua média final no semestre.");

        // Solicita e recebe as notas do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga qual a média da faculdade/escola: ");
        int media = scanner.nextInt();

        System.out.print("Me informe a nota da AC1: ");
        double AC1 = scanner.nextDouble();

        System.out.print("Digite a nota da AC2: ");
        double AC2 = scanner.nextDouble();

        System.out.print("Digite a nota da AG: ");
        double AG = scanner.nextDouble();

        System.out.print("Digite a nota da AF: ");
        double AF = scanner.nextDouble();

        // Ira fazer o cálculo das notas e enviar a média final
        double NotaFinal = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);
        System.out.println("A sua nota média neste semestre será =" + NotaFinal);

        // Mostra se o usuário passou ou reprovou
        if (NotaFinal >= media) {
            System.out.println("Parabéns, vc foi aprovado.");
        }else{
            System.out.println("Sinto muito vc foi reprovado.");
        }
        scanner.close();
    }
}
