package jogo_de_adivinhacao.partida;

import jogo_de_adivinhacao.inicio.inicio;
import java.util.ArrayList;
import java.util.Scanner;

public class partida {
    public int palpite;
    public int tentativas = 1;
    public int segredo;
    
    inicio iniciar = new inicio();
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

    public int palpiteMAIORsegredo(){
        System.out.printf("\nO numero secreto eh MENOR que %d", palpite);
        System.out.printf("\nNumero de tentativas usadas: %d", tentativas);
        for(int contagem : lista_numeros){
                System.out.print("\nNumeros digitados: " + contagem + ", ");
            }
        input_palpite.nextLine();
        lista_numeros.add(palpite);
        
        return palpite;
    }

    public int palpiteMENORsegredo(){
        System.out.printf("\nO numero secreto eh MAIOR que %d", palpite);
        System.out.printf("\nNumero de tentativas usadas: %d", tentativas);
        for(int contagem : lista_numeros){
                System.out.print("\nNumeros digitados: " + contagem + ", ");
            }
        input_palpite.nextLine();
        lista_numeros.add(palpite);

        return palpite;
    }

    public void resetarValoresPartida(){
        tentativas = 1;
        palpite = 0;
        lista_numeros.clear();
    }

    public String resetarPartida(){
        Scanner input_jogar = new Scanner(System.in);
        System.out.println("=============== Deseja jogar de novo? ===============\n"
                         + "                1 - Sim!                             \n"
                         + "                2 - Nao, obrigado(a)                 \n"
                         + "====================================================\n");
        String resposta = input_jogar.nextLine();

        return resposta;
    }

    public void execucaoDaPartida(){
            
            while(tentativas <= 10){            
            
            if(iniciar.dificuldade == 1){
                if(tentativas == 10){
                    exibirDerrota();
                    break;
                
                } else if(palpite == segredo){
                    exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    palpiteMAIORsegredo();

                } else{
                    palpiteMENORsegredo();                                   
                }                
            }
            
            if(iniciar.dificuldade == 2){
                if(tentativas == 7){
                    exibirDerrota();
                    break;
                }else if(palpite == segredo){
                    exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    palpiteMAIORsegredo();
                    
                } else{
                    palpiteMENORsegredo();                 
                }                
            }
            
            if(iniciar.dificuldade == 3){
                if(tentativas == 5){
                    exibirDerrota();
                    break;
                }else if(palpite == segredo){
                    exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    palpiteMAIORsegredo();
                    
                } else{
                    palpiteMENORsegredo();                  
                }                
            }
            
            tentativas++;
        }
    }
}
