package jogo_de_adivinhacao.inicio;

import java.util.Scanner;

public class inicio {
    public int segredo;
    public int dificuldade;

    public void exibirInicioDoJogo(){
        System.out.println("====================================================\n" 
                         + "                   O JOGO COMECOU                   \n" 
                         + "====================================================\n");
        System.out.println("    Nivel de dificuldade:   "
                         + "\n 1 - Facil(10 tentativas) "
                         + "\n 2 - Medio(7 tentativas)  "
                         + "\n 3 - Dificil(5 tentativas)");  
    }

    public int iniciarJogo(){
        segredo = (int) (Math.random()* 100);

        Scanner input_nivelDificuldade = new Scanner(System.in);

        System.out.println("\n Digite o nivel de dificuldade: ");
        dificuldade = input_nivelDificuldade.nextInt();
        input_nivelDificuldade.nextLine();

        return dificuldade;

        }

}
