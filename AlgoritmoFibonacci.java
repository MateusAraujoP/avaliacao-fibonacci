package org.example;

public class AlgoritmoFibonacci {

    static int iteracoes;
    static int somas;

    public static int fibonacciRecursivo(int posicao) { //calcula o numero de fibonacci da posicao desejada de forma recursiva
        if (posicao < 3) {
            iteracoes++;
            return 1;
        } else {
            iteracoes++;
            somas++;
            return fibonacciRecursivo(posicao - 1) + fibonacciRecursivo(posicao - 2);
        }
    }

    public static void sequenciaRecursivo(int posicao) {
        for (int i = 1; i <= posicao; i++) {
            System.out.println(fibonacciRecursivo(i));
            System.out.println("Total de iteracoes " + iteracoes);
            System.out.println("Total de somas realizadas: " + somas);
            iteracoes = 0;
            somas = 0;
        }
    }

    public static void fibonacciIterativo(int posicao) { //calcula o numero de fibonacci da posicao desejada de forma iterativa
        int penultimo = 1; //posicao 1
        int ultimo = 1; //posicao 2
        int resultado = 2; //posicao 3
        System.out.println("1\n1\n2");
        for (int i = 4; i <= posicao; i++) { //comecando a partir da posicao 4, em que i = 4.
            penultimo = ultimo;
            ultimo = resultado;
            resultado = ultimo + penultimo;
            iteracoes++;
            somas++;
            System.out.println(resultado);
        }
        System.out.println("Total de iteracoes: " + iteracoes); //printa os resultados para a analise
        System.out.println("Total de somas realizadas: " + somas);
        iteracoes = 0;
        somas = 0;
    }

}
