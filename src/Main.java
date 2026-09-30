import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //exercicio 1:
        int numero = 0;
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 100);

        //exercicio 2:
        Random rand = new Random();
        int numeroRandom = rand.nextInt(100)+1;
        int chute;
        do {
            System.out.println("Digite um número de um a 100: ");
            chute = teclado.nextInt();
            if (chute > numeroRandom) {
                System.out.println("MENOR");
            } else if (chute < numeroRandom) {
                System.out.println("MAIOR");
            }
        } while (chute != numeroRandom);

        //exercicio 3:
        System.out.println("Digite um número de 1 a 10: ");
        int numero1 = teclado.nextInt();
        int tabuada = 0;
        do {
            int resultado = tabuada * numero1;
            System.out.printf("%d X %d = %d%n", numero1, numero1, resultado);
            tabuada++;
        } while (tabuada <= 10);

        //exercicio 4:
        System.out.println("Digite a idade de 5 pessoas:");
        int pessoasComMaisDe18 = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Pessoa " + (i + 1) +":");
            int idade = teclado.nextInt();
            if (idade > 18){
                pessoasComMaisDe18++;
            }
        }
        System.out.println("Quantidade de pessoas com mais de 18 anos: " + pessoasComMaisDe18);

        //exercicio 5:
        System.out.println("Digite um número aleátorio: ");
        int n1 = teclado.nextInt();
        int contagem = 0;
        do {
            if (contagem % 2 == 0){
                System.out.println(contagem);
            }
            contagem++;
        } while(contagem <= n1);
    }
}