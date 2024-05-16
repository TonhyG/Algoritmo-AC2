import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a nota mínima para ser aprovado?: ");
        double notaminima = scanner.nextDouble();


        System.out.println("Quantos alunos receberam a nota?:");
        int QuantAlunos = scanner.nextInt(); 

        double nota = 0.0;
        double peso = 0.0; 
        double media = 0.0;
        double mediafinal = 0.0;
        double pesototal = 0.0;

        for( int aluno = 1; aluno <= QuantAlunos; aluno++){
            System.out.println("Nome do Aluno" + aluno +"?: ");
            String Nomedoaluno = scanner.next();
            System.out.println("Quantas notas seram lançadas para o(a)" + Nomedoaluno +"? ");
            int Quantnotas = scanner.nextInt();
       
            for( int cont = 1; cont <= Quantnotas ; cont ++){
                boolean notacerta = false;

                while (! notacerta){
                System.out.println("Nota" + cont + "Do(a) Aluno(a)" + Nomedoaluno + ": ");

                
                nota = scanner.nextDouble();
                System.out.println("A nota está " + nota + "correta (s/n)?:" );
                char resposta = scanner.next().charAt(0);
                    if(resposta == 's'|| resposta == 'S'){
                        notacerta = true;
                    
                        
                System.out.println("Qual o peso da prova: ");
                peso = scanner.nextDouble();


                }else if (resposta == 'n' || resposta == 'N'){
                    System.out.println("Digite a nota novamente");
                }else{
                    System.out.println("Respota está incorreta");
                }

                media += nota * peso;
                pesototal += peso;
                System.out.println("Quanto você tirou nessa prova: " + media);
                mediafinal = media/ pesototal;
        }
    }
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
}