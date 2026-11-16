package jogo_de_adivinhacao;

import jogo_de_adivinhacao.inicio.inicio;
import jogo_de_adivinhacao.partida.partida;

public class Main {
    public static void main(String[] args) throws Exception {
        inicio iniciar = new inicio();
        iniciar.exibirInicioDoJogo();
        iniciar.iniciarJogo();
        
        partida partida = new partida();

        int dificuldade = iniciar.dificuldade;
        int segredo = iniciar.segredo;
        int tentativas = partida.tentativas;
        int palpite = partida.palpite;        

         while(tentativas <= 10){            
            
            if(dificuldade == 1){
                if(tentativas == 10){
                    partida.exibirDerrota();
                    break;
                
                } else if(palpite == segredo){
                    partida.exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    partida.palpiteMAIORsegredo();

                } else{
                    partida.palpiteMENORsegredo();                                   
                }                
            }
            
            if(dificuldade == 2){
                if(tentativas == 7){
                    partida.exibirDerrota();
                    break;
                }else if(palpite == segredo){
                    partida.exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    partida.palpiteMAIORsegredo();
                    
                } else{
                    partida.palpiteMENORsegredo();                 
                }                
            }
            
            if(dificuldade == 3){
                if(tentativas == 5){
                    partida.exibirDerrota();
                    break;
                }else if(palpite == segredo){
                    partida.exibirVitoria();
                    break;
                    
                } else if(palpite > segredo){
                    partida.palpiteMAIORsegredo();
                    
                } else{
                    partida.palpiteMENORsegredo();                  
                }                
            }
            
            tentativas++;
        }        
    }    
}