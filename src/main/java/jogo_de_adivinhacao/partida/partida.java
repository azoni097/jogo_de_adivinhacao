package jogo_de_adivinhacao.partida;

import java.util.ArrayList;
import java.util.Scanner;

public class partida {
    public int palpite;
    public int tentativas = 1;

    ArrayList<Integer> lista_numeros = new ArrayList<>();
    Scanner input_palpite = new Scanner(System.in);

    public int exibirVitoria(){
        System.out.printf("\nParabens!!! Voce acertou o numero secreto! %d", palpite);

        return palpite;
    }

    public void exibirDerrota(){
        System.out.println("Voce perdeu!!!");                    
        System.out.printf("\nNumero de tentativas: %d", tentativas);
            for(int contagem : lista_numeros){
                System.out.print("\nNumeros digitados: " + contagem + ", ");
            }
            lista_numeros.add(palpite);
    }

    public int digitarPalpite(){        
        System.out.println("\nDigite seu palpite: ");
        palpite = input_palpite.nextInt();
        input_palpite.nextLine();

        return palpite;
    }

    public void palpiteMAIORsegredo(){
        System.out.printf("\nO numero secreto eh MENOR que %d", palpite);
        System.out.printf("\nNumero de tentativas usadas: %d", tentativas);
        for(int contagem : lista_numeros){
                System.out.print("\nNumeros digitados: " + contagem + ", ");
            }
        input_palpite.nextLine();
        lista_numeros.add(palpite);
    }

    public void palpiteMENORsegredo(){
        System.out.printf("\nO numero secreto eh MAIOR que %d", palpite);
        System.out.printf("\nNumero de tentativas usadas: %d", tentativas);
        for(int contagem : lista_numeros){
                System.out.print("\nNumeros digitados: " + contagem + ", ");
            }
        input_palpite.nextLine();
        lista_numeros.add(palpite);
    }
}
