import java.util.Scanner;

public class Aula8{
    public static void main(String[] args) {
        System.out.println("Qual é a nota mínima para ser aprovado?:");
        Scanner scanner = new Scanner(System.in);
        double notaminima = scanner.nextDouble();
        
        
        System.out.println("Quantas notas você recebeu?");
        double quantnota = scanner.nextDouble();

        double nota = 0.0;
        double peso = 0.0; 
        double media = 0.0;
        double mediafinal = 0.0;
        double pesototal = 0.0;
        
        for (int cont = 0; cont < quantnota; cont ++){
            System.out.println("Digite a sua nota: ");
            nota = scanner.nextDouble();
            System.out.println("Digite o peso dessa prova: ");
            peso = scanner.nextDouble();
            media += nota * peso;
            pesototal += peso;
            System.out.println("Quanto você tirou nessa prova: " + media);
        }
        mediafinal = media/pesototal;
        
        if ( mediafinal < notaminima){
            System.out.println("Você Tirou " + mediafinal);
            System.out.println("Sinto muito você não passou.");
        } else if ( mediafinal >= notaminima && mediafinal < 10){
            System.out.println("Você tirou " + mediafinal);
            System.out.println("Você foi aprovado, parabéns.");
        }else{
            System.out.println("Erro.");
        }
    }
}