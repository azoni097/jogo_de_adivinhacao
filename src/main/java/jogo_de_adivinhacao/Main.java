package jogo_de_adivinhacao;

import jogo_de_adivinhacao.inicio.inicio;
import jogo_de_adivinhacao.partida.partida;

public class Main {
        inicio iniciar = new inicio();
        partida partida = new partida();

        public int dificuldade = iniciar.dificuldade;
        public int segredo = iniciar.segredo;
        public int tentativas = partida.tentativas;
        public int palpite = partida.palpite;

    public static void main(String[] args) throws Exception {
        Main main = new Main();      

        main.iniciar.exibirInicioDoJogo();
        main.iniciar.iniciarJogo();

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            main.partida.execucaoDaPartida();
            String resposta = main.partida.resetarPartida();

            if(resposta.equalsIgnoreCase("sim")){
                main.partida.resetarValoresPartida();

            }else{
                jogarNovamente = false;
                System.out.println("Obrigado por jogar! Ate a proxima!");
                break;
            }
        }       
                       
    }
    
}