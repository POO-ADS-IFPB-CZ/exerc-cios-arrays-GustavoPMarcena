public class Questao2 {

    static int fibonacci(int num){
        if (num == 1 || num == 2) {
            return(1);
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        System.out.println("Sequência de fibonacci de 1 a 30:");
        for(int i=1; i<=30; i++){
            System.out.println(i+"° Elemento: "+fibonacci(i));
        }
    }
}
