import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vetor[] = new float[10]; // Vetor de alunos
        int quantidadeAlunos = 10;
        for(int i=0;i<quantidadeAlunos;i++){
            System.out.print("Insira a nota do "+(i+1)+"° aluno: ");
            vetor[i] = scanner.nextFloat();
        }

        float soma = 0;
        for (float notaAlunos : vetor){
            soma+=notaAlunos;
        }
        float media = soma/quantidadeAlunos;

        int notasAcima = 0;
        int notasAbaixo = 0;
        for (float notaAlunos : vetor){
            if (notaAlunos >= media) notasAcima++;
            else notasAbaixo++;
        }
        System.out.println("Notas acima da média: "+notasAcima+"\nNotas abaixo da média: "+notasAbaixo);
    }
}
