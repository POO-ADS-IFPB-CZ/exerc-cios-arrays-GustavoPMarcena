import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int soma = 0, quantidade = 0, num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();
        while(num>=0){
            soma += num;
            quantidade ++;
            System.out.print("Digite outro numero inteiro: ");
            num = scanner.nextInt();
        }
        int media = soma/quantidade;
        System.out.println("Quantidade de números: "+quantidade+"\nMédia: "+media);

    }
}
